package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.gson.reflect.*;
import com.google.gson.*;
import com.google.common.collect.*;
import java.util.*;

public class IllIllIlllIllllIIllI implements TypeAdapterFactory
{
    public TypeAdapter create(final Gson gson, final TypeToken typeToken) {
        final Class rawType = typeToken.getRawType();
        if (!rawType.isEnum()) {
            return null;
        }
        final HashMap hashMap = Maps.newHashMap();
        Object[] enumConstants;
        for (int length = (enumConstants = rawType.getEnumConstants()).length, i = 0; i < length; ++i) {
            final Object o = enumConstants[i];
            hashMap.put(this.llllIIIIlIIIlIlllIll(o), o);
        }
        return new llIlIIIIIlIIlIlIIlll(this, hashMap);
    }
    
    private String llllIIIIlIIIlIlllIll(final Object o) {
        return (o instanceof Enum) ? ((Enum)o).name().toLowerCase(Locale.US) : o.toString().toLowerCase(Locale.US);
    }
}
