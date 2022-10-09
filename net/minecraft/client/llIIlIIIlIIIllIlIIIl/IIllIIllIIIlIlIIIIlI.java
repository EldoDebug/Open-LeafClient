package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import java.io.*;

public class IIllIIllIIIlIlIIIIlI extends FileNotFoundException
{
    public IIllIIllIIIlIlIIIIlI(final File file, final String s) {
        super(String.format("'%s' in ResourcePack '%s'", s, file));
    }
}
