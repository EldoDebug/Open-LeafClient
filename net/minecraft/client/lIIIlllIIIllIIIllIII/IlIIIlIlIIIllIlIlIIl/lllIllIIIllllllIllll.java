package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import leaf.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class lllIllIIIllllllIllll
{
    private Map lIlIlIIIllIIllIIIllI;
    private Map IlIlIIIllIIllIlllllI;
    private lIIlIIIlIllIlIllIIIl IIIIlllIIIIIIlIIIlll;
    private FontRenderer llllIIllllIlIlIIIIll;
    private double IlIllIlIlIIIlIlIlIII;
    private double IIlllIIlIllIllIlIIll;
    private double lllIIIIlllllIlIIllIl;
    public IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    public IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl;
    public llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI;
    public llIllIIIIIllIlIIIIlI IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    public float IllIIlllIIIIlllIIlIl;
    public llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    public double lIIIIlIIIIIlllIllIII;
    public double lIIIlllIIIllIIIllIII;
    public double llIIlIIIlIIIllIlIIIl;
    private boolean IlIlIIIIIIlllIlIllIl;
    private boolean IIllIIllIIIlIlIIIIlI;
    private boolean IIIlIIIlIlIIlllIIlll;
    public net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llIllIlIIIIllIlIIllI;
    
    public lllIllIIIllllllIllll(final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll, final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl) {
        this.lIlIlIIIllIIllIIIllI = Maps.newHashMap();
        this.IlIlIIIllIIllIlllllI = Maps.newHashMap();
        this.IlIlIIIIIIlllIlIllIl = false;
        this.IIllIIllIIIlIlIIIIlI = true;
        this.IIIlIIIlIlIIlllIIlll = false;
        this.llIllIlIIIIllIlIIllI = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.class, new lIIIlllIIIllIIIllIII(this));
        this.lIlIlIIIllIIllIIIllI.put(llIllIlIlIIIIIIIllII.class, new lIlIIlllIIlIIlIlllIl(this));
        this.lIlIlIIIllIIllIIIllI.put(llIllIlIIIIllIlIIllI.class, new llIlIIIIIlIIlIlIIlll(this, new lllllIlIIIlIlIIlllII(), 0.7f));
        this.lIlIlIIIllIIllIIIllI.put(IIIlIIIlIlIIlllIIlll.class, new llIIIIIIlIllIIlIIIll(this, new IIIllllllIllIIIlllIl(), 0.7f));
        this.lIlIlIIIllIIllIIIllI.put(IlIlIIIllIllIIIIIllI.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI(this, new IlIlIIIllIIllIlllllI(), 0.7f));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII.class, new IllIllIIIIlIIlIlllII(this, new IlIlIIIllIIllIlllllI(), 0.7f));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIllllllIllIIIlllIl.class, new llllIllllIllllIlIlII(this, new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llIlIIIIIlIIlIlIIlll(), 0.5f));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.class, new llIIlIIIlIIIllIlIIIl(this, new lIlIlIIIllIIllIIIllI(), 0.3f));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.class, new IlIllllIIlIIlIlIlIll(this, new llIIIlIlIllIIlIlIlII(), 0.4f));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.class, new lIlIlIlllIIlIlIlllIl(this, new IIlllIIIlIlllIIlllII(), 0.3f));
        this.lIlIlIIIllIIllIIIllI.put(llIIlllIIlllIIllIllI.class, new lIIIIlIlIllllIIlIllI(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.class, new llllIIllllIlIlIIIIll(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.class, new IIIIlllIIIIIIlIIIlll(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll.class, new IllIIlllllIIllIIllIl(this));
        this.lIlIlIIIllIIllIIIllI.put(llllllIllIllIlIllllI.class, new llIIIlIlllIllIIlIllI(this));
        this.lIlIlIIIllIIllIIIllI.put(IllIllIlllIllllIIllI.class, new lllllIIlIlIIIlIlIIIl(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.class, new llllIIIlIlllIlIIIIIl(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII.class, new IlIIlIlIIIlIIlIlIlII(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIlIIIIIlIIlIlIIlll.class, new lIIllIIIllllIlllIllI(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IIIllllllIllIIIlllIl.class, new lllllIIIIIlIlIIIIIIl(this, new IlllIIIIlIIIlIlIlIIl(16), 0.25f));
        this.lIlIlIIIllIIllIIIllI.put(IlIlIllllllllIIIIlII.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlllIIIIlIIIlIlIlIIl(this));
        this.lIlIlIIIllIIllIIIllI.put(IlIllIlIlIIIlIlIlIII.class, new IlIlIIIlIIlIlIIlllIl(this, new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIlIlIIIlIIlIlIlII(), 0.5f, 6.0f));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IIIlIIIlIlIIlllIIlll(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlllllllIIIlIIIlIlII.class, new llIIIllIlIllIllIIIIl(this, new IIlIlIlIIlIllIIIIIIl(), 0.7f));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.class, new IlIIlllllIIllIIlllll(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIlIllllllllIIIIlII(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(this));
        this.lIlIlIIIllIIllIIIllI.put(lllIIIIlllllIlIIllIl.class, new IIlIIIIlllIlllllIlII(this));
        this.lIlIlIIIllIIllIIIllI.put(IlIlIlIlIlllllllllIl.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.class, new IIlllllIllIllIlIlIII(this));
        this.lIlIlIIIllIIllIIIllI.put(llIllIIIIIllIlIIIIlI.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIllIlIlIIIlIlIlIII(this));
        this.lIlIlIIIllIIllIIIllI.put(IlIlIIIIIIlllIlIllIl.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IllIllIlllIllllIIllI(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(this, illlIlIIllIlIlIlIIl));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIIllIlllllI.class, new IIIIIllIIIIlIIIIllIl(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(this));
        this.lIlIlIIIllIIllIIIllI.put(lIIIIlIIIIIlllIllIII.class, new lIllIIIIIlllIIlIIllI(this, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIIllIllIIlIlIl, illlIlIIllIlIlIlIIl));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.class, new lIllIIIIIlllIIlIIllI(this, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.y, illlIlIIllIlIlIlIIl));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.class, new lIllIIIIIlllIIlIIllI(this, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.L, illlIlIIllIlIlIlIIl));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.class, new lIllIIIIIlllIIlIIllI(this, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIllIlIIIllllllIIlII, illlIlIIllIlIlIlIIl));
        this.lIlIlIIIllIIllIIIllI.put(IllIIlllIIIIlllIIlIl.class, new IIlIIIlllIllIllIlIII(this, illlIlIIllIlIlIlIIl));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.class, new lIllIIIIIlllIIlIIllI(this, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.O, illlIlIIllIlIlIlIIl));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII.class, new lIllIIIIIlllIIlIIllI(this, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.af, illlIlIIllIlIlIlIIl));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIlIIIIIIlllIlIllIl(this, 2.0f));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIlIIIIIIlllIlIllIl(this, 0.5f));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IIlllIIlIllIllIlIIll(this, illlIlIIllIlIlIlIIl));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIlIIlIlIIlllIl.class, new IIlIlIllllIlllIIIIll(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IIIlIIIlIlIIlllIIlll.class, new IIIllIIIlIlIIllIIIlI(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.lllIIIIlllllIlIIllIl(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lllIIIIlllllIlIIllIl.class, new IIlllIIlllIIIlIlllII(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IIlIlIlIIlIllIIIIIIl(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIlIlIIIIIIIllII(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI(this));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.class, new IIIlIIlIIIIlllIlllII(this, new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IIIlIIIlIlIIlllIIlll(), 0.75f));
        this.lIlIlIIIllIIllIIIllI.put(net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.class, new IIIIIIIIIlllIllIlIlI(this));
        this.IIIIlllIIIIIIlIIIlll = new lIIlIIIlIllIlIllIIIl(this);
        this.IlIlIIIllIIllIlllllI.put("default", this.IIIIlllIIIIIIlIIIlll);
        this.IlIlIIIllIIllIlllllI.put("slim", new lIIlIIIlIllIlIllIIIl(this, true));
        net.optifine.llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI);
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aB.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aB, this, this.lIlIlIIIllIIllIIIllI);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final double ilIllIlIlIIIlIlIlIII, final double iIlllIIlIllIllIlIIll, final double lllIIIIlllllIlIIllIl) {
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
    }
    
    public net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final Class clazz) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.lIlIlIIIllIIllIIIllI.get(clazz);
        if (llllIIIIlIIIlIlllIll == null && clazz != llIllIIIIIllIlIIIIlI.class) {
            llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(clazz.getSuperclass());
            this.lIlIlIIIllIIllIIIllI.put(clazz, llllIIIIlIIIlIlllIll);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl = this.IlIlIIIllIIllIlllllI.get(((net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).lIlIlIIIllIIllIIIllI());
            return (liIlIIIlIllIlIllIIIl != null) ? liIlIIIlIllIlIllIIIl : this.IIIIlllIIIIIIlIIIlll;
        }
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.getClass());
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl, final FontRenderer llllIIllllIlIlIIIIll, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llIllIIIIIllIlIIIIlI ilIIIlIlIIIllIlIlIIl, final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl, final float n) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl && ((net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI).ah()) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI));
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI2, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIIllIIIlIlIIllIIIlI, ilIlIlIlIlllllllllIl2, ilIlIlIlIlllllllllIl, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI), (net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI)) {
                this.IlIlIIIllIllIIIIIllI = (float)(((net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI2, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIIllIIllIIllIIlIIl, ilIlIlIlIlllllllllIl2, ilIlIlIlIlllllllllIl, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI))).llIllIIIIIllIlIIIIlI() * 90 + 180);
                this.IllIIlllIIIIlllIIlIl = 0.0f;
            }
            else if (llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII) {
                this.IlIlIIIllIllIIIIIllI = (float)(((net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl)).llIllIIIIIllIlIIIIlI() * 90 + 180);
                this.IllIIlllIIIIlllIIlIl = 0.0f;
            }
        }
        else {
            this.IlIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl + (llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll - llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl) * n;
            this.IllIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI + (llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI - llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI) * n;
        }
        if (llllIIIlIlllIlIIIIIl.IIIllIIllIIIIIIlIIlI == 2) {
            this.IlIlIIIllIllIIIIIllI += 180.0f;
        }
        this.lIIIIlIIIIIlllIllIII = llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl + (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl) * n;
        this.lIIIlllIIIllIIIllIII = llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII + (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII) * n;
        this.llIIlIIIlIIIllIlIIIl = llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl + (llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl) * n;
    }
    
    public void llllIIIIlIIIlIlllIll(final float ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean iIllIIllIIIlIlIIIIlI) {
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean iiIlIIIlIlIIlllIIlll) {
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IIIlIIIlIlIIlllIIlll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, false);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final double n, final double n2, final double n3) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        return llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, n, n2, n3);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final boolean b) {
        if (llIllIIIIIllIlIIIIlI.lllllIIIIIlIlIIIIIIl == 0) {
            llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
            llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII;
            llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
        }
        final double n2 = llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl + (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl) * n;
        final double n3 = llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII + (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII) * n;
        final double n4 = llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl + (llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl) * n;
        final float n5 = llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl + (llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll - llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl) * n;
        int a_ = llIllIIIIIllIlIIIIlI.a_(n);
        if (llIllIIIIIllIlIIIIlI.lIIIIIlIlIIIlIIIIlIl()) {
            a_ = 15728880;
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, a_ % 65536 / 1.0f, a_ / 65536 / 1.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n2 - this.IlIllIlIlIIIlIlIlIII, n3 - this.IIlllIIlIllIllIlIIll, n4 - this.lllIIIIlllllIlIIllIl, n5, n, b);
    }
    
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        final double n2 = llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl + (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl) * n;
        final double n3 = llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII + (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII) * n;
        final double n4 = llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl + (llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl) * n;
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        if (llllIIIIlIIIlIlllIll != null && this.llllIIIIlIIIlIlllIll != null) {
            final int a_ = llIllIIIIIllIlIIIIlI.a_(n);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, a_ % 65536 / 1.0f, a_ / 65536 / 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n2 - this.IlIllIlIlIIIlIlIlIII, n3 - this.IIlllIIlIllIllIlIIll, n4 - this.lllIIIIlllllIlIIllIl);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final float n5) {
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5, false);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final float n5, final boolean b) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = null;
        try {
            llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            if (llllIIIIlIIIlIlllIll != null && this.llllIIIIlIIIlIlllIll != null) {
                try {
                    if (llllIIIIlIIIlIlllIll instanceof IIllIIIlIIlIlIlIIIII) {
                        ((IIllIIIlIIlIlIlIIIII)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(this.IlIlIIIIIIlllIlIllIl);
                    }
                    if (net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                        this.llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll;
                    }
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5);
                }
                catch (Throwable t) {
                    throw new IIlIlllIlIlllIlIllll(net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Rendering entity in world"));
                }
                try {
                    if (!this.IlIlIIIIIIlllIlIllIl) {
                        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5);
                    }
                }
                catch (Throwable t2) {
                    throw new IIlIlllIlIlllIlIllll(net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t2, "Post-rendering entity in world"));
                }
                if (llIllIIIIIllIlIIIIlI.IIIIIIIllllIlIIIIIII() || b || !Leaf.instance.modManager.hitBoxMod.lIlIlIIIllIIllIIIllI()) {
                    return true;
                }
                try {
                    this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5);
                    return true;
                }
                catch (Throwable t3) {
                    throw new IIlIlllIlIlllIlIllll(net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t3, "Rendering entity hitbox in world"));
                }
            }
            if (this.llllIIIIlIIIlIlllIll != null) {
                return false;
            }
            return true;
        }
        catch (Throwable t4) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t4, "Rendering entity in world");
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Entity being rendered"));
            final net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Renderer details");
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Assigned renderer", llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Location", net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n, n2, n3));
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Rotation", n4);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Delta", n5);
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final float n5) {
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            final float n6 = llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII / 2.0f;
            final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll ilIIlllIIlIlllllIIlI = llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI();
            final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll - llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl + n, ilIIlllIIlIlllllIIlI.IlIlIlIlIlllllllllIl - llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + n2, ilIIlllIIlIlllllIIlI.llIllIIIIIllIlIIIIlI - llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII + n3, ilIIlllIIlIlllllIIlI.IlIIIlIlIIIllIlIlIIl - llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl + n, ilIIlllIIlIlllllIIlI.IlIlIIIllIllIIIIIllI - llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + n2, ilIIlllIIlIlllllIIlI.IllIIlllIIIIlllIIlIl - llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII + n3);
            final int n7 = Leaf.instance.modManager.hitBoxMod.lIlIlIIIllIIllIIIllI() ? Leaf.instance.modManager.hitBoxMod.getColor().getRed() : 255;
            final int n8 = Leaf.instance.modManager.hitBoxMod.lIlIlIIIllIIllIIIllI() ? Leaf.instance.modManager.hitBoxMod.getColor().getGreen() : 255;
            final int n9 = Leaf.instance.modManager.hitBoxMod.lIlIlIIIllIIllIIIllI() ? Leaf.instance.modManager.hitBoxMod.getColor().getBlue() : 255;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n7, n8, n9, 255);
            if (Leaf.instance.modManager.hitBoxMod.lookDirection) {
                final net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
                final e llllIIIIlIIIlIlllIll3 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n5);
                llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(3, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n, n2 + llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI(), n3).IlIlIlIlIlllllllllIl(n7, n8, n9, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n + llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll * 2.0, n2 + llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI() + llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl * 2.0, n3 + llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI * 2.0).IlIlIlIlIlllllllllIl(n7, n8, n9, 255).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public double IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3) {
        final double n4 = n - this.lIIIIlIIIIIlllIllIII;
        final double n5 = n2 - this.lIIIlllIIIllIIIllIII;
        final double n6 = n3 - this.llIIlIIIlIIIllIlIIIl;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }
    
    public FontRenderer llIllIIIIIllIlIIIIlI() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public void llIllIIIIIllIlIIIIlI(final boolean ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
    }
    
    public Map IlIIIlIlIIIllIlIlIIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final Map lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public Map IlIlIIIllIllIIIIIllI() {
        return Collections.unmodifiableMap((Map<?, ?>)this.IlIlIIIllIIllIlllllI);
    }
}
