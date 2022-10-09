package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.util.*;
import com.google.gson.*;
import java.text.*;

public abstract class llllIIIIlIIIlIlllIll extends IlllllllIIIlIIIlIlII
{
    public static final SimpleDateFormat llllIIIIlIIIlIlllIll;
    protected final Date IlIlIlIlIlllllllllIl;
    protected final String llIllIIIIIllIlIIIIlI;
    protected final Date IlIIIlIlIIIllIlIlIIl;
    protected final String IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    }
    
    public llllIIIIlIIIlIlllIll(final Object o, final Date date, final String s, final Date ilIIIlIlIIIllIlIlIIl, final String s2) {
        super(o);
        this.IlIlIlIlIlllllllllIl = ((date == null) ? new Date() : date);
        this.llIllIIIIIllIlIIIIlI = ((s == null) ? "(Unknown)" : s);
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ((s2 == null) ? "Banned by an operator." : s2);
    }
    
    protected llllIIIIlIIIlIlllIll(final Object o, final JsonObject jsonObject) {
        super(o, jsonObject);
        Date ilIlIlIlIlllllllllIl;
        try {
            ilIlIlIlIlllllllllIl = (jsonObject.has("created") ? net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.parse(jsonObject.get("created").getAsString()) : new Date());
        }
        catch (ParseException ex) {
            ilIlIlIlIlllllllllIl = new Date();
        }
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = (jsonObject.has("source") ? jsonObject.get("source").getAsString() : "(Unknown)");
        Date ilIIIlIlIIIllIlIlIIl;
        try {
            ilIIIlIlIIIllIlIlIIl = (jsonObject.has("expires") ? net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.parse(jsonObject.get("expires").getAsString()) : null);
        }
        catch (ParseException ex2) {
            ilIIIlIlIIIllIlIlIIl = null;
        }
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (jsonObject.has("reason") ? jsonObject.get("reason").getAsString() : "Banned by an operator.");
    }
    
    public Date llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl != null && this.IlIIIlIlIIIllIlIlIIl.before(new Date());
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        jsonObject.addProperty("created", net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.format(this.IlIlIlIlIlllllllllIl));
        jsonObject.addProperty("source", this.llIllIIIIIllIlIIIIlI);
        jsonObject.addProperty("expires", (this.IlIIIlIlIIIllIlIlIIl == null) ? "forever" : net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.format(this.IlIIIlIlIIIllIlIlIIl));
        jsonObject.addProperty("reason", this.IlIlIIIllIllIIIIIllI);
    }
}
