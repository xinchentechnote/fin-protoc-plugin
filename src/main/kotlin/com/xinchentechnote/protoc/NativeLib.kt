package com.xinchentechnote.protoc

import com.sun.jna.Library
import com.sun.jna.Native
import com.sun.jna.Platform
import com.sun.jna.Pointer
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import kotlin.io.path.createParentDirectories
import kotlin.io.path.exists

object NativeLoader {
    init {
        //TODO fix difference platform
        val userHome = System.getProperty("user.home")
        var targetPath = Paths.get(userHome, ".protoc", "lib")
        var targetFile = targetPath.resolve("libpacketdsl.dll")
        if (!targetFile.exists()){
                if (!targetFile.parent.toFile().exists()) {
                    targetFile.createParentDirectories()
                }
                var resourceAsStream = NativeLoader.javaClass.getResourceAsStream("/lib/libpacketdsl.dll")
                if (resourceAsStream != null) {
                    Files.copy(resourceAsStream,targetFile, StandardCopyOption.REPLACE_EXISTING)
                    resourceAsStream.close()
                }
        }
        System.setProperty("jna.library.path", targetPath.toString())
        FinProtocLibrary.INSTANCE
    }
}

interface FinProtocLibrary : Library {
    // C: extern char* FormatPacketDslExport(char* dsl);
    fun FormatPacketDslExport(dsl: String): Pointer

    // C: extern void CompilePacketDslExport(char* dsl, char* output, unsigned int lang);
    fun CompilePacketDslExport(dsl: String, output: String, lang: Int)

    companion object {
        val INSTANCE: FinProtocLibrary = Native.load(
            when {
                Platform.isWindows() -> "packetdsl"      // finprotoc.dll
                Platform.isMac() -> "packetdsl"         // libfinprotoc.dylib
                else -> "packetdsl"                     // libfinprotoc.so
            },
            FinProtocLibrary::class.java
        )
    }
}
