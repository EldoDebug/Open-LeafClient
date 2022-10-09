package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.io.*;
import com.google.gson.*;
import com.mojang.authlib.*;
import java.util.*;

public class IlIlIllllllllIIIIlII extends lllIIIIlllllIlIIllIl
{
    public IlIlIllllllllIIIIlII(final File file) {
        super(file);
    }
    
    @Override
    protected IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        return new IIlllIlIIllIlIlIlIIl(jsonObject);
    }
    
    @Override
    public String[] IlIlIlIlIlllllllllIl() {
        final String[] array = new String[this.llIllIIIIIllIlIIIIlI().size()];
        int n = 0;
        final Iterator<IIlllIlIIllIlIlIlIIl> iterator = this.llIllIIIIIllIlIIIIlI().values().iterator();
        while (iterator.hasNext()) {
            array[n++] = ((GameProfile)iterator.next().IlIIIlIlIIIllIlIlIIl()).getName();
        }
        return array;
    }
    
    protected String llllIIIIlIIIlIlllIll(final GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }
    
    public GameProfile llllIIIIlIIIlIlllIll(final String s) {
        for (final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl : this.llIllIIIIIllIlIIIIlI().values()) {
            if (s.equalsIgnoreCase(((GameProfile)illlIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl()).getName())) {
                return (GameProfile)illlIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl();
            }
        }
        return null;
    }
}
