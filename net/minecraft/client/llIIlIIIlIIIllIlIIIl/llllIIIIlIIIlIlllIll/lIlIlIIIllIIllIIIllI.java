package net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import com.google.gson.*;
import java.util.*;

public class lIlIlIIIllIIllIIIllI extends IlIIIlIlIIIllIlIlIIl
{
    public llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final HashSet hashSet = Sets.newHashSet();
        for (final Map.Entry<String, V> entry : asJsonObject.entrySet()) {
            final String s = entry.getKey();
            final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI((JsonElement)entry.getValue(), "language");
            final String illIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "region");
            final String illIIlllIIIIlllIIlIl2 = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "name");
            final boolean llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "bidirectional", false);
            if (illIIlllIIIIlllIIlIl.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + s + "'->region: empty value");
            }
            if (illIIlllIIIIlllIIlIl2.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + s + "'->name: empty value");
            }
            if (!hashSet.add(new IlIllIlIlIIIlIlIlIII(s, illIIlllIIIIlllIIlIl, illIIlllIIIIlllIIlIl2, llllIIIIlIIIlIlllIll))) {
                throw new JsonParseException("Duplicate language->'" + s + "' defined");
            }
        }
        return new llIllIlIIIIllIlIIllI(hashSet);
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "language";
    }
}
