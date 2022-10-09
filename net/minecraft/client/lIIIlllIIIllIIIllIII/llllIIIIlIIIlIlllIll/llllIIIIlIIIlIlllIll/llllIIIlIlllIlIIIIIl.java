package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import com.google.gson.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class llllIIIlIlllIlIIIIIl implements JsonDeserializer
{
    public IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return new IllIIlllIIIIlllIIlIl(this.llIllIIIIIllIlIIIIlI(asJsonObject), this.llllIIIIlIIIlIlllIll(asJsonObject), this.IlIlIlIlIlllllllllIl(asJsonObject), (IlIlIlIlIlllllllllIl)jsonDeserializationContext.deserialize((JsonElement)asJsonObject, (Type)IlIlIlIlIlllllllllIl.class));
    }
    
    protected int llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        return IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "tintindex", -1);
    }
    
    private String IlIlIlIlIlllllllllIl(final JsonObject jsonObject) {
        return IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(jsonObject, "texture");
    }
    
    private lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI(final JsonObject jsonObject) {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "cullface", ""));
    }
}
