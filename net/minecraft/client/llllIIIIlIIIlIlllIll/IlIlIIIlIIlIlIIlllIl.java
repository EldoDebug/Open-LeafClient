package net.minecraft.client.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.lang3.*;
import com.google.gson.*;

public class IlIlIIIlIIlIlIIlllIl implements JsonDeserializer
{
    public IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "entry");
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl();
        ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "replace", false));
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll = IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "category", IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()));
        ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        Validate.notNull((Object)llllIIIIlIIIlIlllIll, "Invalid category", new Object[0]);
        if (ilIlIIIllIllIIIIIllI.has("sounds")) {
            final JsonArray llIllIlIIIIllIlIIllI = IIlllllIllIllIlIlIII.llIllIlIIIIllIlIIllI(ilIlIIIllIllIIIIIllI, "sounds");
            for (int i = 0; i < llIllIlIIIIllIlIIllI.size(); ++i) {
                final JsonElement value = llIllIlIIIIllIlIIllI.get(i);
                final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI();
                if (IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(value)) {
                    illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(value, "sound"));
                }
                else {
                    final JsonObject ilIlIIIllIllIIIIIllI2 = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(value, "sound");
                    illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI2, "name"));
                    if (ilIlIIIllIllIIIIIllI2.has("type")) {
                        final IIIlIIIlIlIIlllIIlll llllIIIIlIIIlIlllIll2 = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI2, "type"));
                        Validate.notNull((Object)llllIIIIlIIIlIlllIll2, "Invalid type", new Object[0]);
                        illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                    }
                    if (ilIlIIIllIllIIIIIllI2.has("volume")) {
                        final float liiiIlIIIIIlllIllIII = IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII(ilIlIIIllIllIIIIIllI2, "volume");
                        Validate.isTrue(liiiIlIIIIIlllIllIII > 0.0f, "Invalid volume", new Object[0]);
                        illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
                    }
                    if (ilIlIIIllIllIIIIIllI2.has("pitch")) {
                        final float liiiIlIIIIIlllIllIII2 = IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII(ilIlIIIllIllIIIIIllI2, "pitch");
                        Validate.isTrue(liiiIlIIIIIlllIllIII2 > 0.0f, "Invalid pitch", new Object[0]);
                        illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII2);
                    }
                    if (ilIlIIIllIllIIIIIllI2.has("weight")) {
                        final int liiIlllIIIllIIIllIII = IIlllllIllIllIlIlIII.lIIIlllIIIllIIIllIII(ilIlIIIllIllIIIIIllI2, "weight");
                        Validate.isTrue(liiIlllIIIllIIIllIII > 0, "Invalid weight", new Object[0]);
                        illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
                    }
                    if (ilIlIIIllIllIIIIIllI2.has("stream")) {
                        illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.llllIIIlIlllIlIIIIIl(ilIlIIIllIllIIIIIllI2, "stream"));
                    }
                }
                ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll().add(illIIllIIIlIlIIIIlI);
            }
        }
        return ilIlIIIIIIlllIlIllIl;
    }
}
