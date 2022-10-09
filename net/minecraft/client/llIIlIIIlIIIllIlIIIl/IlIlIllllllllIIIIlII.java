package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import java.io.*;

class IlIlIllllllllIIIIlII implements FileFilter
{
    @Override
    public boolean accept(final File file) {
        final boolean b = file.isFile() && file.getName().endsWith(".zip");
        final boolean b2 = file.isDirectory() && new File(file, "pack.mcmeta").isFile();
        return b || b2;
    }
}
