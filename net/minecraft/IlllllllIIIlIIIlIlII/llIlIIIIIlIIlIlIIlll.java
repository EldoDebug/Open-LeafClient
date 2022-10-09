package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.gson.*;
import java.util.*;
import com.google.gson.stream.*;

class llIlIIIIIlIIlIlIIlll extends TypeAdapter
{
    final /* synthetic */ IllIllIlllIllllIIllI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ Map IlIlIlIlIlllllllllIl;
    
    llIlIIIIIlIIlIlIIlll(final IllIllIlllIllllIIllI llllIIIIlIIIlIlllIll, final Map ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void write(final JsonWriter jsonWriter, final Object o) {
        if (o == null) {
            jsonWriter.nullValue();
        }
        else {
            jsonWriter.value(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(o));
        }
    }
    
    public Object read(final JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.IlIlIlIlIlllllllllIl.get(jsonReader.nextString());
    }
}
