package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import org.apache.commons.lang3.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.gson.*;
import com.google.common.collect.*;
import java.util.*;

public class IIIlIIIlIlIIlllIIlll implements JsonDeserializer
{
    public IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(jsonDeserializationContext, asJsonObject);
        final String llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(asJsonObject);
        final boolean empty = StringUtils.isEmpty((CharSequence)llIllIIIIIllIlIIIIlI);
        final boolean empty2 = llllIIIIlIIIlIlllIll.isEmpty();
        if (empty2 && empty) {
            throw new JsonParseException("BlockModel requires either elements or parent, found neither");
        }
        if (!empty && !empty2) {
            throw new JsonParseException("BlockModel requires either elements or parent, found both");
        }
        final Map ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(asJsonObject);
        final boolean llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(asJsonObject);
        llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll3 = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;
        if (asJsonObject.has("display")) {
            llllIIIIlIIIlIlllIll3 = (llIllIlIIIIllIlIIllI)jsonDeserializationContext.deserialize((JsonElement)IIlllllIllIllIlIlIII.llIIlIIIlIIIllIlIIIl(asJsonObject, "display"), (Type)llIllIlIIIIllIlIIllI.class);
        }
        return empty2 ? new IlIlIIIIIIlllIlIllIl(new lIllllIllIllIIllllll(llIllIIIIIllIlIIIIlI), ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2, true, llllIIIIlIIIlIlllIll3) : new IlIlIIIIIIlllIlIllIl(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2, true, llllIIIIlIIIlIlllIll3);
    }
    
    private Map IlIlIlIlIlllllllllIl(final JsonObject jsonObject) {
        final HashMap hashMap = Maps.newHashMap();
        if (jsonObject.has("textures")) {
            for (final Map.Entry<String, V> entry : jsonObject.getAsJsonObject("textures").entrySet()) {
                hashMap.put(entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
            }
        }
        return hashMap;
    }
    
    private String llIllIIIIIllIlIIIIlI(final JsonObject jsonObject) {
        return IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "parent", "");
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        return IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "ambientocclusion", true);
    }
    
    protected List llllIIIIlIIIlIlllIll(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject) {
        final ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("elements")) {
            final Iterator iterator = IIlllllIllIllIlIlIII.llIllIlIIIIllIlIIllI(jsonObject, "elements").iterator();
            while (iterator.hasNext()) {
                arrayList.add(jsonDeserializationContext.deserialize((JsonElement)iterator.next(), (Type)IlIIIlIlIIIllIlIlIIl.class));
            }
        }
        return arrayList;
    }
}
