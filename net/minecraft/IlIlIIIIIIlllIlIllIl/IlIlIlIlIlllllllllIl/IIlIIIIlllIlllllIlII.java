package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.io.*;
import com.google.gson.*;
import com.mojang.authlib.*;
import java.util.*;

public class IIlIIIIlllIlllllIlII extends lllIIIIlllllIlIIllIl
{
    public IIlIIIIlllIlllllIlII(final File file) {
        super(file);
    }
    
    @Override
    protected IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        return new IIIlIIlIIIIlllIlllII(jsonObject);
    }
    
    @Override
    public String[] IlIlIlIlIlllllllllIl() {
        final String[] array = new String[this.llIllIIIIIllIlIIIIlI().size()];
        int n = 0;
        final Iterator<IIIlIIlIIIIlllIlllII> iterator = this.llIllIIIIIllIlIIIIlI().values().iterator();
        while (iterator.hasNext()) {
            array[n++] = ((GameProfile)iterator.next().IlIIIlIlIIIllIlIlIIl()).getName();
        }
        return array;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final GameProfile gameProfile) {
        final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)this.llllIIIIlIIIlIlllIll(gameProfile);
        return iiIlIIlIIIIlllIlllII != null && iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl();
    }
    
    protected String IlIlIlIlIlllllllllIl(final GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }
    
    public GameProfile llllIIIIlIIIlIlllIll(final String s) {
        for (final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII : this.llIllIIIIIllIlIIIIlI().values()) {
            if (s.equalsIgnoreCase(((GameProfile)iiIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl()).getName())) {
                return (GameProfile)iiIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl();
            }
        }
        return null;
    }
}
