package net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.gson.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llllIIIIlIIIlIlllIll implements IIlIIIIIllIlIIIlIIll
{
    private static final Gson llllIIIIlIIIlIlllIll;
    private IIIIIIIIIlllIllIlIlI IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new GsonBuilder().registerTypeAdapter((Type)IIllllIIIlIIIIIIllIl.class, (Object)new IlllIIIIlIIIlIlIlIIl()).registerTypeAdapter((Type)lllIllIIIllllllIllll.class, (Object)new llIllIlIlIIIIIIIllII()).registerTypeAdapter((Type)IIIIIIIIIlllIllIlIlI.class, (Object)new IIlIlIlIIlIllIIIIIIl()).registerTypeHierarchyAdapter((Class)llIIIIIIlIllIIlIIIll.class, (Object)new lIIIIlIlIllllIIlIllI()).registerTypeHierarchyAdapter((Class)IlIlIIIlIIlIlIIlllIl.class, (Object)new IIlIIIIlllIlllllIlII()).registerTypeAdapterFactory((TypeAdapterFactory)new IllIllIlllIllllIIllI()).create();
    }
    
    public llllIIIIlIIIlIlllIll() {
    }
    
    public llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IlIlIlIlIlllllllllIl = (IIIIIIIIIlllIllIlIlI)net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.fromJson(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32767), (Class)IIIIIIIIIlllIllIlIlI.class);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.toJson((Object)this.IlIlIlIlIlllllllllIl));
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public IIIIIIIIIlllIllIlIlI llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
