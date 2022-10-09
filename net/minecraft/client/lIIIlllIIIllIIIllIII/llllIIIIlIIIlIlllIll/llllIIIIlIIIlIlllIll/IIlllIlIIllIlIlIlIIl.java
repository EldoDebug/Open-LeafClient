package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import com.google.gson.*;

public class IIlllIlIIllIlIlIlIIl implements JsonDeserializer
{
    public IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return new IlIlIllllllllIIIIlII(this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl(asJsonObject)), this.llllIIIIlIIIlIlllIll(asJsonObject), this.IlIIIlIlIIIllIlIlIIl(asJsonObject), this.llIllIIIIIllIlIIIIlI(asJsonObject));
    }
    
    private lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final String s) {
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
        return new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), "block/" + lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl(final JsonObject jsonObject) {
        return IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "uvlock", false);
    }
    
    protected lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        final int llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "x", 0);
        final int llllIIIIlIIIlIlllIll2 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "y", 0);
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll3 = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        if (llllIIIIlIIIlIlllIll3 == null) {
            throw new JsonParseException("Invalid BlockModelRotation x: " + llllIIIIlIIIlIlllIll + ", y: " + llllIIIIlIIIlIlllIll2);
        }
        return llllIIIIlIIIlIlllIll3;
    }
    
    protected String IlIlIlIlIlllllllllIl(final JsonObject jsonObject) {
        return IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(jsonObject, "model");
    }
    
    protected int llIllIIIIIllIlIIIIlI(final JsonObject jsonObject) {
        return IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "weight", 1);
    }
}
