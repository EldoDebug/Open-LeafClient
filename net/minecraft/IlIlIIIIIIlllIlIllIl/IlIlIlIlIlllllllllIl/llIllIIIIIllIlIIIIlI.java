package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.util.*;
import com.google.gson.*;

public class llIllIIIIIllIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    public llIllIIIIIllIlIIIIlI(final String s) {
        this(s, null, null, null, null);
    }
    
    public llIllIIIIIllIlIIIIlI(final String s, final Date date, final String s2, final Date date2, final String s3) {
        super(s, date, s2, date2, s3);
    }
    
    public llIllIIIIIllIlIIIIlI(final JsonObject jsonObject) {
        super(IlIlIlIlIlllllllllIl(jsonObject), jsonObject);
    }
    
    private static String IlIlIlIlIlllllllllIl(final JsonObject jsonObject) {
        return jsonObject.has("ip") ? jsonObject.get("ip").getAsString() : null;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        if (this.IlIIIlIlIIIllIlIlIIl() != null) {
            jsonObject.addProperty("ip", (String)this.IlIIIlIlIIIllIlIlIIl());
            super.llllIIIIlIIIlIlllIll(jsonObject);
        }
    }
}
