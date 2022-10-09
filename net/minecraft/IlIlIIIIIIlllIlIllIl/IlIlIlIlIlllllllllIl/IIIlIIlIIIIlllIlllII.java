package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import com.mojang.authlib.*;
import com.google.gson.*;
import java.util.*;

public class IIIlIIlIIIIlllIlllII extends IlllllllIIIlIIIlIlII
{
    private final int llllIIIIlIIIlIlllIll;
    private final boolean IlIlIlIlIlllllllllIl;
    
    public IIIlIIlIIIIlllIlllII(final GameProfile gameProfile, final int llllIIIIlIIIlIlllIll, final boolean ilIlIlIlIlllllllllIl) {
        super(gameProfile);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public IIIlIIlIIIIlllIlllII(final JsonObject jsonObject) {
        super(IlIlIlIlIlllllllllIl(jsonObject), jsonObject);
        this.llllIIIIlIIIlIlllIll = (jsonObject.has("level") ? jsonObject.get("level").getAsInt() : 0);
        this.IlIlIlIlIlllllllllIl = (jsonObject.has("bypassesPlayerLimit") && jsonObject.get("bypassesPlayerLimit").getAsBoolean());
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        if (this.IlIIIlIlIIIllIlIlIIl() != null) {
            jsonObject.addProperty("uuid", (((GameProfile)this.IlIIIlIlIIIllIlIlIIl()).getId() == null) ? "" : ((GameProfile)this.IlIIIlIlIIIllIlIlIIl()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.IlIIIlIlIIIllIlIlIIl()).getName());
            super.llllIIIIlIIIlIlllIll(jsonObject);
            jsonObject.addProperty("level", (Number)this.llllIIIIlIIIlIlllIll);
            jsonObject.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.IlIlIlIlIlllllllllIl));
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
