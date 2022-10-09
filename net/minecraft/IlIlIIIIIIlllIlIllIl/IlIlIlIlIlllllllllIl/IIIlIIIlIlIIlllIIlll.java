package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.io.*;
import com.google.gson.*;
import com.mojang.authlib.*;
import java.util.*;

public class IIIlIIIlIlIIlllIIlll extends lllIIIIlllllIlIIllIl
{
    public IIIlIIIlIlIIlllIIlll(final File file) {
        super(file);
    }
    
    @Override
    protected IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        return new IlIlIIIlIIlIlIIlllIl(jsonObject);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final GameProfile gameProfile) {
        return this.IlIIIlIlIIIllIlIlIIl(gameProfile);
    }
    
    @Override
    public String[] IlIlIlIlIlllllllllIl() {
        final String[] array = new String[this.llIllIIIIIllIlIIIIlI().size()];
        int n = 0;
        final Iterator<IlIlIIIlIIlIlIIlllIl> iterator = this.llIllIIIIIllIlIIIIlI().values().iterator();
        while (iterator.hasNext()) {
            array[n++] = ((GameProfile)iterator.next().IlIIIlIlIIIllIlIlIIl()).getName();
        }
        return array;
    }
    
    protected String IlIlIlIlIlllllllllIl(final GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }
    
    public GameProfile llllIIIIlIIIlIlllIll(final String s) {
        for (final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl : this.llIllIIIIIllIlIIIIlI().values()) {
            if (s.equalsIgnoreCase(((GameProfile)ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl()).getName())) {
                return (GameProfile)ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl();
            }
        }
        return null;
    }
}
