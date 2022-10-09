package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import com.google.gson.*;
import java.lang.reflect.*;

public class lIIIIlIIIIIlllIllIII
{
    static final Gson llllIIIIlIIIlIlllIll;
    public float IlIlIlIlIlllllllllIl;
    public float llIllIIIIIllIlIIIIlI;
    public float IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    public float IllIIlllIIIIlllIIlIl;
    public float llllIIIlIlllIlIIIIIl;
    public float lIIIIlIIIIIlllIllIII;
    public float lIIIlllIIIllIIIllIII;
    public float llIIlIIIlIIIllIlIIIl;
    public float llIllIlIIIIllIlIIllI;
    public float lIlIlIIIllIIllIIIllI;
    public float IlIlIIIllIIllIlllllI;
    public float IIIIlllIIIIIIlIIIlll;
    public float llllIIllllIlIlIIIIll;
    public float IlIllIlIlIIIlIlIlIII;
    public float IIlllIIlIllIllIlIIll;
    public int lllIIIIlllllIlIIllIl;
    public boolean IlIlIIIIIIlllIlIllIl;
    public boolean IIllIIllIIIlIlIIIIlI;
    public int IIIlIIIlIlIIlllIIlll;
    public boolean IlIlIIIlIIlIlIIlllIl;
    public boolean IlllllllIIIlIIIlIlII;
    public boolean IIlIIIIlllIlllllIlII;
    public boolean IIIlIIlIIIIlllIlllII;
    public boolean IlIlIllllllllIIIIlII;
    public boolean IIlllIlIIllIlIlIlIIl;
    public boolean llIIIlIlIllIIlIlIlII;
    public int lllllIlIIIlIlIIlllII;
    public boolean lIllllllIIllIlIlIlII;
    public int llIIlllIIlllIIllIllI;
    public boolean IIlllIIIlIlllIIlllII;
    public int IIlIIIIIllIlIIIlIIll;
    public int llllllIllIllIlIllllI;
    public int IIIllllllIllIIIlllIl;
    public int IlIIIlIIIllllIlIlIlI;
    public int IIIIIllIIIIlIIIIllIl;
    public int IIIIIIIIIlllIllIlIlI;
    public int IIllllIIIlIIIIIIllIl;
    public int IlllIIIIlIIIlIlIlIIl;
    public int lllIllIIIllllllIllll;
    public int llIllIlIlIIIIIIIllII;
    public int IIlIlIlIIlIllIIIIIIl;
    public int IllIllIIIIlIIlIlllII;
    public int IlIllllIIlIIlIlIlIll;
    public int IllIllIlllIllllIIllI;
    public int llIlIIIIIlIIlIlIIlll;
    public int IlIIlIlIIIlIIlIlIlII;
    public int IllIlIIllIllIIlIllII;
    public int lIIlIIIlIllIlIllIIIl;
    public int IIlIIIlllIllIllIlIII;
    public int lIlIlIlllIIlIlIlllIl;
    public int llIIIIIIlIllIIlIIIll;
    public int lIIIIlIlIllllIIlIllI;
    public int llIIIlIlllIllIIlIllI;
    public int IlIIllIIllIIllIIlIIl;
    public int lllllIIIIIlIlIIIIIIl;
    public int IllIIlllllIIllIIllIl;
    public int lIllIIIIIlllIIlIIllI;
    public int lIlIIlllIIlIIlIlllIl;
    public int llIIIllIlIllIllIIIIl;
    public int IIIllIIIlIlIIllIIIlI;
    public int IIlllIIlllIIIlIlllII;
    public int IlIIlllllIIllIIlllll;
    public int lllllIIlIlIIIlIlIIIl;
    public int IIlllllIllIllIlIlIII;
    public int llllIllllIllllIlIlII;
    public int IIlIlIllllIlllIIIIll;
    public int lIIllIIIllllIlllIllI;
    public int IllIlIllIllIlllIIlll;
    public int IIllIIIlIIlIlIlIIIII;
    public int llIllIIlllllllllllll;
    public int lllllIIllIlIllIllllI;
    public int IlIIIIIlIIllIIlIlIll;
    public int IllllIIlIlIllIIIllII;
    public int lllllIIIIIlIIlllIlIl;
    public int IlIllllIIIlIllIlIIll;
    public int lIIIIIlIlIIIlIIIIlIl;
    public int IIllIIIlIIIIlIIlIIII;
    
    static {
        llllIIIIlIIIlIlllIll = new GsonBuilder().registerTypeAdapter((Type)lIIIIlIIIIIlllIllIII.class, (Object)new lIIIlllIIIllIIIllIII()).create();
    }
    
    public static lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final String s) {
        if (s.length() == 0) {
            return new lIIIIlIIIIIlllIllIII();
        }
        try {
            return (lIIIIlIIIIIlllIllIII)lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.fromJson(s, (Class)lIIIIlIIIIIlllIllIII.class);
        }
        catch (Exception ex) {
            return new lIIIIlIIIIIlllIllIII();
        }
    }
    
    @Override
    public String toString() {
        return net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.toJson((Object)this);
    }
    
    public lIIIIlIIIIIlllIllIII() {
        this.IlIlIlIlIlllllllllIl = 684.412f;
        this.llIllIIIIIllIlIIIIlI = 684.412f;
        this.IlIIIlIlIIIllIlIlIIl = 512.0f;
        this.IlIlIIIllIllIIIIIllI = 512.0f;
        this.IllIIlllIIIIlllIIlIl = 200.0f;
        this.llllIIIlIlllIlIIIIIl = 200.0f;
        this.lIIIIlIIIIIlllIllIII = 0.5f;
        this.lIIIlllIIIllIIIllIII = 80.0f;
        this.llIIlIIIlIIIllIlIIIl = 160.0f;
        this.llIllIlIIIIllIlIIllI = 80.0f;
        this.lIlIlIIIllIIllIIIllI = 8.5f;
        this.IlIlIIIllIIllIlllllI = 12.0f;
        this.IIIIlllIIIIIIlIIIlll = 1.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 1.0f;
        this.IIlllIIlIllIllIlIIll = 0.0f;
        this.lllIIIIlllllIlIIllIl = 63;
        this.IlIlIIIIIIlllIlIllIl = true;
        this.IIllIIllIIIlIlIIIIlI = true;
        this.IIIlIIIlIlIIlllIIlll = 8;
        this.IlIlIIIlIIlIlIIlllIl = true;
        this.IlllllllIIIlIIIlIlII = true;
        this.IIlIIIIlllIlllllIlII = true;
        this.IIIlIIlIIIIlllIlllII = true;
        this.IlIlIllllllllIIIIlII = true;
        this.IIlllIlIIllIlIlIlIIl = true;
        this.llIIIlIlIllIIlIlIlII = true;
        this.lllllIlIIIlIlIIlllII = 4;
        this.lIllllllIIllIlIlIlII = true;
        this.llIIlllIIlllIIllIllI = 80;
        this.IIlllIIIlIlllIIlllII = false;
        this.IIlIIIIIllIlIIIlIIll = -1;
        this.llllllIllIllIlIllllI = 4;
        this.IIIllllllIllIIIlllIl = 4;
        this.IlIIIlIIIllllIlIlIlI = 33;
        this.IIIIIllIIIIlIIIIllIl = 10;
        this.IIIIIIIIIlllIllIlIlI = 0;
        this.IIllllIIIlIIIIIIllIl = 256;
        this.IlllIIIIlIIIlIlIlIIl = 33;
        this.lllIllIIIllllllIllll = 8;
        this.llIllIlIlIIIIIIIllII = 0;
        this.IIlIlIlIIlIllIIIIIIl = 256;
        this.IllIllIIIIlIIlIlllII = 33;
        this.IlIllllIIlIIlIlIlIll = 10;
        this.IllIllIlllIllllIIllI = 0;
        this.llIlIIIIIlIIlIlIIlll = 80;
        this.IlIIlIlIIIlIIlIlIlII = 33;
        this.IllIlIIllIllIIlIllII = 10;
        this.lIIlIIIlIllIlIllIIIl = 0;
        this.IIlIIIlllIllIllIlIII = 80;
        this.lIlIlIlllIIlIlIlllIl = 33;
        this.llIIIIIIlIllIIlIIIll = 10;
        this.lIIIIlIlIllllIIlIllI = 0;
        this.llIIIlIlllIllIIlIllI = 80;
        this.IlIIllIIllIIllIIlIIl = 17;
        this.lllllIIIIIlIlIIIIIIl = 20;
        this.IllIIlllllIIllIIllIl = 0;
        this.lIllIIIIIlllIIlIIllI = 128;
        this.lIlIIlllIIlIIlIlllIl = 9;
        this.llIIIllIlIllIllIIIIl = 20;
        this.IIIllIIIlIlIIllIIIlI = 0;
        this.IIlllIIlllIIIlIlllII = 64;
        this.IlIIlllllIIllIIlllll = 9;
        this.lllllIIlIlIIIlIlIIIl = 2;
        this.IIlllllIllIllIlIlIII = 0;
        this.llllIllllIllllIlIlII = 32;
        this.IIlIlIllllIlllIIIIll = 8;
        this.lIIllIIIllllIlllIllI = 8;
        this.IllIlIllIllIlllIIlll = 0;
        this.IIllIIIlIIlIlIlIIIII = 16;
        this.llIllIIlllllllllllll = 8;
        this.lllllIIllIlIllIllllI = 1;
        this.IlIIIIIlIIllIIlIlIll = 0;
        this.IllllIIlIlIllIIIllII = 16;
        this.lllllIIIIIlIIlllIlIl = 7;
        this.IlIllllIIIlIllIlIIll = 1;
        this.lIIIIIlIlIIIlIIIIlIl = 16;
        this.IIllIIIlIIIIlIIlIIII = 16;
        this.llllIIIIlIIIlIlllIll();
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = 684.412f;
        this.llIllIIIIIllIlIIIIlI = 684.412f;
        this.IlIIIlIlIIIllIlIlIIl = 512.0f;
        this.IlIlIIIllIllIIIIIllI = 512.0f;
        this.IllIIlllIIIIlllIIlIl = 200.0f;
        this.llllIIIlIlllIlIIIIIl = 200.0f;
        this.lIIIIlIIIIIlllIllIII = 0.5f;
        this.lIIIlllIIIllIIIllIII = 80.0f;
        this.llIIlIIIlIIIllIlIIIl = 160.0f;
        this.llIllIlIIIIllIlIIllI = 80.0f;
        this.lIlIlIIIllIIllIIIllI = 8.5f;
        this.IlIlIIIllIIllIlllllI = 12.0f;
        this.IIIIlllIIIIIIlIIIlll = 1.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 1.0f;
        this.IIlllIIlIllIllIlIIll = 0.0f;
        this.lllIIIIlllllIlIIllIl = 63;
        this.IlIlIIIIIIlllIlIllIl = true;
        this.IIllIIllIIIlIlIIIIlI = true;
        this.IIIlIIIlIlIIlllIIlll = 8;
        this.IlIlIIIlIIlIlIIlllIl = true;
        this.IlllllllIIIlIIIlIlII = true;
        this.IIlIIIIlllIlllllIlII = true;
        this.IIIlIIlIIIIlllIlllII = true;
        this.IlIlIllllllllIIIIlII = true;
        this.IIlllIlIIllIlIlIlIIl = true;
        this.llIIIlIlIllIIlIlIlII = true;
        this.lllllIlIIIlIlIIlllII = 4;
        this.lIllllllIIllIlIlIlII = true;
        this.llIIlllIIlllIIllIllI = 80;
        this.IIlllIIIlIlllIIlllII = false;
        this.IIlIIIIIllIlIIIlIIll = -1;
        this.llllllIllIllIlIllllI = 4;
        this.IIIllllllIllIIIlllIl = 4;
        this.IlIIIlIIIllllIlIlIlI = 33;
        this.IIIIIllIIIIlIIIIllIl = 10;
        this.IIIIIIIIIlllIllIlIlI = 0;
        this.IIllllIIIlIIIIIIllIl = 256;
        this.IlllIIIIlIIIlIlIlIIl = 33;
        this.lllIllIIIllllllIllll = 8;
        this.llIllIlIlIIIIIIIllII = 0;
        this.IIlIlIlIIlIllIIIIIIl = 256;
        this.IllIllIIIIlIIlIlllII = 33;
        this.IlIllllIIlIIlIlIlIll = 10;
        this.IllIllIlllIllllIIllI = 0;
        this.llIlIIIIIlIIlIlIIlll = 80;
        this.IlIIlIlIIIlIIlIlIlII = 33;
        this.IllIlIIllIllIIlIllII = 10;
        this.lIIlIIIlIllIlIllIIIl = 0;
        this.IIlIIIlllIllIllIlIII = 80;
        this.lIlIlIlllIIlIlIlllIl = 33;
        this.llIIIIIIlIllIIlIIIll = 10;
        this.lIIIIlIlIllllIIlIllI = 0;
        this.llIIIlIlllIllIIlIllI = 80;
        this.IlIIllIIllIIllIIlIIl = 17;
        this.lllllIIIIIlIlIIIIIIl = 20;
        this.IllIIlllllIIllIIllIl = 0;
        this.lIllIIIIIlllIIlIIllI = 128;
        this.lIlIIlllIIlIIlIlllIl = 9;
        this.llIIIllIlIllIllIIIIl = 20;
        this.IIIllIIIlIlIIllIIIlI = 0;
        this.IIlllIIlllIIIlIlllII = 64;
        this.IlIIlllllIIllIIlllll = 9;
        this.lllllIIlIlIIIlIlIIIl = 2;
        this.IIlllllIllIllIlIlIII = 0;
        this.llllIllllIllllIlIlII = 32;
        this.IIlIlIllllIlllIIIIll = 8;
        this.lIIllIIIllllIlllIllI = 8;
        this.IllIlIllIllIlllIIlll = 0;
        this.IIllIIIlIIlIlIlIIIII = 16;
        this.llIllIIlllllllllllll = 8;
        this.lllllIIllIlIllIllllI = 1;
        this.IlIIIIIlIIllIIlIlIll = 0;
        this.IllllIIlIlIllIIIllII = 16;
        this.lllllIIIIIlIIlllIlIl = 7;
        this.IlIllllIIIlIllIlIIll = 1;
        this.lIIIIIlIlIIIlIIIIlIl = 16;
        this.IIllIIIlIIIIlIIlIIII = 16;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = (lIIIIlIIIIIlllIllIII)o;
            return this.llIIIIIIlIllIIlIIIll == liiiIlIIIIIlllIllIII.llIIIIIIlIllIIlIIIll && this.llIIIlIlllIllIIlIllI == liiiIlIIIIIlllIllIII.llIIIlIlllIllIIlIllI && this.lIIIIlIlIllllIIlIllI == liiiIlIIIIIlllIllIII.lIIIIlIlIllllIIlIllI && this.lIlIlIlllIIlIlIlllIl == liiiIlIIIIIlllIllIII.lIlIlIlllIIlIlIlllIl && Float.compare(liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI, this.lIlIlIIIllIIllIIIllI) == 0 && Float.compare(liiiIlIIIIIlllIllIII.llllIIllllIlIlIIIIll, this.llllIIllllIlIlIIIIll) == 0 && Float.compare(liiiIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll, this.IIIIlllIIIIIIlIIIlll) == 0 && Float.compare(liiiIlIIIIIlllIllIII.IIlllIIlIllIllIlIIll, this.IIlllIIlIllIllIlIIll) == 0 && Float.compare(liiiIlIIIIIlllIllIII.IlIllIlIlIIIlIlIlIII, this.IlIllIlIlIIIlIlIlIII) == 0 && this.llllllIllIllIlIllllI == liiiIlIIIIIlllIllIII.llllllIllIllIlIllllI && this.lllllIIIIIlIlIIIIIIl == liiiIlIIIIIlllIllIII.lllllIIIIIlIlIIIIIIl && this.lIllIIIIIlllIIlIIllI == liiiIlIIIIIlllIllIII.lIllIIIIIlllIIlIIllI && this.IllIIlllllIIllIIllIl == liiiIlIIIIIlllIllIII.IllIIlllllIIllIIllIl && this.IlIIllIIllIIllIIlIIl == liiiIlIIIIIlllIllIII.IlIIllIIllIIllIIlIIl && Float.compare(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl) == 0 && Float.compare(liiiIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII, this.lIIIIlIIIIIlllIllIII) == 0 && Float.compare(liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl, this.IllIIlllIIIIlllIIlIl) == 0 && Float.compare(liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl, this.llllIIIlIlllIlIIIIIl) == 0 && this.lllllIIllIlIllIllllI == liiiIlIIIIIlllIllIII.lllllIIllIlIllIllllI && this.IllllIIlIlIllIIIllII == liiiIlIIIIIlllIllIII.IllllIIlIlIllIIIllII && this.IlIIIIIlIIllIIlIlIll == liiiIlIIIIIlllIllIII.IlIIIIIlIIllIIlIlIll && this.llIllIIlllllllllllll == liiiIlIIIIIlllIllIII.llIllIIlllllllllllll && this.IllIlIIllIllIIlIllII == liiiIlIIIIIlllIllIII.IllIlIIllIllIIlIllII && this.IIlIIIlllIllIllIlIII == liiiIlIIIIIlllIllIII.IIlIIIlllIllIllIlIII && this.lIIlIIIlIllIlIllIIIl == liiiIlIIIIIlllIllIII.lIIlIIIlIllIlIllIIIl && this.IlIIlIlIIIlIIlIlIlII == liiiIlIIIIIlllIllIII.IlIIlIlIIIlIIlIlIlII && this.IIIIIllIIIIlIIIIllIl == liiiIlIIIIIlllIllIII.IIIIIllIIIIlIIIIllIl && this.IIllllIIIlIIIIIIllIl == liiiIlIIIIIlllIllIII.IIllllIIIlIIIIIIllIl && this.IIIIIIIIIlllIllIlIlI == liiiIlIIIIIlllIllIII.IIIIIIIIIlllIllIlIlI && this.IlIIIlIIIllllIlIlIlI == liiiIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI && this.IIIlIIIlIlIIlllIIlll == liiiIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll && this.IIlIIIIIllIlIIIlIIll == liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll && this.lllllIIlIlIIIlIlIIIl == liiiIlIIIIIlllIllIII.lllllIIlIlIIIlIlIIIl && this.llllIllllIllllIlIlII == liiiIlIIIIIlllIllIII.llllIllllIllllIlIlII && this.IIlllllIllIllIlIlIII == liiiIlIIIIIlllIllIII.IIlllllIllIllIlIlIII && this.IlIIlllllIIllIIlllll == liiiIlIIIIIlllIllIII.IlIIlllllIIllIIlllll && this.IlIllllIIlIIlIlIlIll == liiiIlIIIIIlllIllIII.IlIllllIIlIIlIlIlIll && this.llIlIIIIIlIIlIlIIlll == liiiIlIIIIIlllIllIII.llIlIIIIIlIIlIlIIlll && this.IllIllIlllIllllIIllI == liiiIlIIIIIlllIllIII.IllIllIlllIllllIIllI && this.IllIllIIIIlIIlIlllII == liiiIlIIIIIlllIllIII.IllIllIIIIlIIlIlllII && this.lllIllIIIllllllIllll == liiiIlIIIIIlllIllIII.lllIllIIIllllllIllll && this.IIlIlIlIIlIllIIIIIIl == liiiIlIIIIIlllIllIII.IIlIlIlIIlIllIIIIIIl && this.llIllIlIlIIIIIIIllII == liiiIlIIIIIlllIllIII.llIllIlIlIIIIIIIllII && this.IlllIIIIlIIIlIlIlIIl == liiiIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl && Float.compare(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI, this.llIllIIIIIllIlIIIIlI) == 0 && this.llIIIllIlIllIllIIIIl == liiiIlIIIIIlllIllIII.llIIIllIlIllIllIIIIl && this.IIlllIIlllIIIlIlllII == liiiIlIIIIIlllIllIII.IIlllIIlllIIIlIlllII && this.IIIllIIIlIlIIllIIIlI == liiiIlIIIIIlllIllIII.IIIllIIIlIlIIllIIIlI && this.lIlIIlllIIlIIlIlllIl == liiiIlIIIIIlllIllIII.lIlIIlllIIlIIlIlllIl && this.lIIIIIlIlIIIlIIIIlIl == liiiIlIIIIIlllIllIII.lIIIIIlIlIIIlIIIIlIl && this.IlIllllIIIlIllIlIIll == liiiIlIIIIIlllIllIII.IlIllllIIIlIllIlIIll && this.lllllIIIIIlIIlllIlIl == liiiIlIIIIIlllIllIII.lllllIIIIIlIIlllIlIl && this.IIllIIIlIIIIlIIlIIII == liiiIlIIIIIlllIllIII.IIllIIIlIIIIlIIlIIII && this.llIIlllIIlllIIllIllI == liiiIlIIIIIlllIllIII.llIIlllIIlllIIllIllI && Float.compare(liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI) == 0 && Float.compare(liiiIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII, this.lIIIlllIIIllIIIllIII) == 0 && Float.compare(liiiIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl, this.llIIlIIIlIIIllIlIIIl) == 0 && Float.compare(liiiIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI, this.llIllIlIIIIllIlIIllI) == 0 && this.lIIllIIIllllIlllIllI == liiiIlIIIIIlllIllIII.lIIllIIIllllIlllIllI && this.IIllIIIlIIlIlIlIIIII == liiiIlIIIIIlllIllIII.IIllIIIlIIlIlIlIIIII && this.IllIlIllIllIlllIIlll == liiiIlIIIIIlllIllIII.IllIlIllIllIlllIIlll && this.IIlIlIllllIlllIIIIll == liiiIlIIIIIlllIllIII.IIlIlIllllIlllIIIIll && this.IIIllllllIllIIIlllIl == liiiIlIIIIIlllIllIII.IIIllllllIllIIIlllIl && this.lllIIIIlllllIlIIllIl == liiiIlIIIIIlllIllIII.lllIIIIlllllIlIIllIl && Float.compare(liiiIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI, this.IlIlIIIllIIllIlllllI) == 0 && Float.compare(liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl) == 0 && this.IlIlIIIIIIlllIlIllIl == liiiIlIIIIIlllIllIII.IlIlIIIIIIlllIlIllIl && this.IIllIIllIIIlIlIIIIlI == liiiIlIIIIIlllIllIII.IIllIIllIIIlIlIIIIlI && this.lIllllllIIllIlIlIlII == liiiIlIIIIIlllIllIII.lIllllllIIllIlIlIlII && this.IIlllIIIlIlllIIlllII == liiiIlIIIIIlllIllIII.IIlllIIIlIlllIIlllII && this.IIlIIIIlllIlllllIlII == liiiIlIIIIIlllIllIII.IIlIIIIlllIlllllIlII && this.IIlllIlIIllIlIlIlIIl == liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl && this.IlIlIIIlIIlIlIIlllIl == liiiIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl && this.IIIlIIlIIIIlllIlllII == liiiIlIIIIIlllIllIII.IIIlIIlIIIIlllIlllII && this.IlIlIllllllllIIIIlII == liiiIlIIIIIlllIllIII.IlIlIllllllllIIIIlII && this.IlllllllIIIlIIIlIlII == liiiIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII && this.llIIIlIlIllIIlIlIlII == liiiIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII && this.lllllIlIIIlIlIIlllII == liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * ((this.IlIlIlIlIlllllllllIl != 0.0f) ? Float.floatToIntBits(this.IlIlIlIlIlllllllllIl) : 0) + ((this.llIllIIIIIllIlIIIIlI != 0.0f) ? Float.floatToIntBits(this.llIllIIIIIllIlIIIIlI) : 0)) + ((this.IlIIIlIlIIIllIlIlIIl != 0.0f) ? Float.floatToIntBits(this.IlIIIlIlIIIllIlIlIIl) : 0)) + ((this.IlIlIIIllIllIIIIIllI != 0.0f) ? Float.floatToIntBits(this.IlIlIIIllIllIIIIIllI) : 0)) + ((this.IllIIlllIIIIlllIIlIl != 0.0f) ? Float.floatToIntBits(this.IllIIlllIIIIlllIIlIl) : 0)) + ((this.llllIIIlIlllIlIIIIIl != 0.0f) ? Float.floatToIntBits(this.llllIIIlIlllIlIIIIIl) : 0)) + ((this.lIIIIlIIIIIlllIllIII != 0.0f) ? Float.floatToIntBits(this.lIIIIlIIIIIlllIllIII) : 0)) + ((this.lIIIlllIIIllIIIllIII != 0.0f) ? Float.floatToIntBits(this.lIIIlllIIIllIIIllIII) : 0)) + ((this.llIIlIIIlIIIllIlIIIl != 0.0f) ? Float.floatToIntBits(this.llIIlIIIlIIIllIlIIIl) : 0)) + ((this.llIllIlIIIIllIlIIllI != 0.0f) ? Float.floatToIntBits(this.llIllIlIIIIllIlIIllI) : 0)) + ((this.lIlIlIIIllIIllIIIllI != 0.0f) ? Float.floatToIntBits(this.lIlIlIIIllIIllIIIllI) : 0)) + ((this.IlIlIIIllIIllIlllllI != 0.0f) ? Float.floatToIntBits(this.IlIlIIIllIIllIlllllI) : 0)) + ((this.IIIIlllIIIIIIlIIIlll != 0.0f) ? Float.floatToIntBits(this.IIIIlllIIIIIIlIIIlll) : 0)) + ((this.llllIIllllIlIlIIIIll != 0.0f) ? Float.floatToIntBits(this.llllIIllllIlIlIIIIll) : 0)) + ((this.IlIllIlIlIIIlIlIlIII != 0.0f) ? Float.floatToIntBits(this.IlIllIlIlIIIlIlIlIII) : 0)) + ((this.IIlllIIlIllIllIlIIll != 0.0f) ? Float.floatToIntBits(this.IIlllIIlIllIllIlIIll) : 0)) + this.lllIIIIlllllIlIIllIl) + (this.IlIlIIIIIIlllIlIllIl ? 1 : 0)) + (this.IIllIIllIIIlIlIIIIlI ? 1 : 0)) + this.IIIlIIIlIlIIlllIIlll) + (this.IlIlIIIlIIlIlIIlllIl ? 1 : 0)) + (this.IlllllllIIIlIIIlIlII ? 1 : 0)) + (this.IIlIIIIlllIlllllIlII ? 1 : 0)) + (this.IIIlIIlIIIIlllIlllII ? 1 : 0)) + (this.IlIlIllllllllIIIIlII ? 1 : 0)) + (this.IIlllIlIIllIlIlIlIIl ? 1 : 0)) + (this.llIIIlIlIllIIlIlIlII ? 1 : 0)) + this.lllllIlIIIlIlIIlllII) + (this.lIllllllIIllIlIlIlII ? 1 : 0)) + this.llIIlllIIlllIIllIllI) + (this.IIlllIIIlIlllIIlllII ? 1 : 0)) + this.IIlIIIIIllIlIIIlIIll) + this.llllllIllIllIlIllllI) + this.IIIllllllIllIIIlllIl) + this.IlIIIlIIIllllIlIlIlI) + this.IIIIIllIIIIlIIIIllIl) + this.IIIIIIIIIlllIllIlIlI) + this.IIllllIIIlIIIIIIllIl) + this.IlllIIIIlIIIlIlIlIIl) + this.lllIllIIIllllllIllll) + this.llIllIlIlIIIIIIIllII) + this.IIlIlIlIIlIllIIIIIIl) + this.IllIllIIIIlIIlIlllII) + this.IlIllllIIlIIlIlIlIll) + this.IllIllIlllIllllIIllI) + this.llIlIIIIIlIIlIlIIlll) + this.IlIIlIlIIIlIIlIlIlII) + this.IllIlIIllIllIIlIllII) + this.lIIlIIIlIllIlIllIIIl) + this.IIlIIIlllIllIllIlIII) + this.lIlIlIlllIIlIlIlllIl) + this.llIIIIIIlIllIIlIIIll) + this.lIIIIlIlIllllIIlIllI) + this.llIIIlIlllIllIIlIllI) + this.IlIIllIIllIIllIIlIIl) + this.lllllIIIIIlIlIIIIIIl) + this.IllIIlllllIIllIIllIl) + this.lIllIIIIIlllIIlIIllI) + this.lIlIIlllIIlIIlIlllIl) + this.llIIIllIlIllIllIIIIl) + this.IIIllIIIlIlIIllIIIlI) + this.IIlllIIlllIIIlIlllII) + this.IlIIlllllIIllIIlllll) + this.lllllIIlIlIIIlIlIIIl) + this.IIlllllIllIllIlIlIII) + this.llllIllllIllllIlIlII) + this.IIlIlIllllIlllIIIIll) + this.lIIllIIIllllIlllIllI) + this.IllIlIllIllIlllIIlll) + this.IIllIIIlIIlIlIlIIIII) + this.llIllIIlllllllllllll) + this.lllllIIllIlIllIllllI) + this.IlIIIIIlIIllIIlIlIll) + this.IllllIIlIlIllIIIllII) + this.lllllIIIIIlIIlllIlIl) + this.IlIllllIIIlIllIlIIll) + this.lIIIIIlIlIIIlIIIIlIl) + this.IIllIIIlIIIIlIIlIIII;
    }
    
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        return new llllIIIlIlllIlIIIIIl(this, null);
    }
}
