package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import com.mojang.authlib.*;
import com.google.gson.*;
import java.util.*;

public class IlIlIIIlIIlIlIIlllIl extends llllIIIIlIIIlIlllIll
{
    public IlIlIIIlIIlIlIIlllIl(final GameProfile gameProfile) {
        this(gameProfile, null, null, null, null);
    }
    
    public IlIlIIIlIIlIlIIlllIl(final GameProfile gameProfile, final Date date, final String s, final Date date2, final String s2) {
        super(gameProfile, date2, s, date2, s2);
    }
    
    public IlIlIIIlIIlIlIIlllIl(final JsonObject jsonObject) {
        super(IlIlIlIlIlllllllllIl(jsonObject), jsonObject);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        if (this.IlIIIlIlIIIllIlIlIIl() != null) {
            jsonObject.addProperty("uuid", (((GameProfile)this.IlIIIlIlIIIllIlIlIIl()).getId() == null) ? "" : ((GameProfile)this.IlIIIlIlIIIllIlIlIIl()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.IlIIIlIlIIIllIlIlIIl()).getName());
            super.llllIIIIlIIIlIlllIll(jsonObject);
        }
    }
    
    private static GameProfile IlIlIlIlIlllllllllIl(final JsonObject jsonObject) {
        if (jsonObject.has("uuid") && jsonObject.has("name")) {
            final String asString = jsonObject.get("uuid").getAsString();
            UUID fromString;
            try {
                fromString = UUID.fromString(asString);
            }
            catch (Throwable t) {
                return null;
            }
            return new GameProfile(fromString, jsonObject.get("name").getAsString());
        }
        return null;
    }
}
