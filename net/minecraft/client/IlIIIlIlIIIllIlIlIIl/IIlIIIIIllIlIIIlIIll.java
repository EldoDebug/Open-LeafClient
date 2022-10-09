package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import com.google.common.collect.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.shaders.*;

public class IIlIIIIIllIlIIIlIIll
{
    public float llllIIIIlIIIlIlllIll;
    public float IlIlIlIlIlllllllllIl;
    private int IlllllllIIIlIIIlIlII;
    private int IIlIIIIlllIlllllIlII;
    public float llIllIIIIIllIlIIIIlI;
    public float IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    public float IllIIlllIIIIlllIIlIl;
    public float llllIIIlIlllIlIIIIIl;
    public float lIIIIlIIIIIlllIllIII;
    private boolean IIIlIIlIIIIlllIlllII;
    private int IlIlIllllllllIIIIlII;
    public boolean lIIIlllIIIllIIIllIII;
    public boolean llIIlIIIlIIIllIlIIIl;
    public boolean llIllIlIIIIllIlIIllI;
    public List lIlIlIIIllIIllIIIllI;
    public List IlIlIIIllIIllIlllllI;
    public final String IIIIlllIIIIIIlIIIlll;
    private IlIIIlIlIIIllIlIlIIl IIlllIlIIllIlIlIlIIl;
    public float llllIIllllIlIlIIIIll;
    public float IlIllIlIlIIIlIlIlIII;
    public float IIlllIIlIllIllIlIIll;
    public List lllIIIIlllllIlIIllIl;
    public boolean IlIlIIIIIIlllIlIllIl;
    public float IIllIIllIIIlIlIIIIlI;
    public float IIIlIIIlIlIIlllIIlll;
    public float IlIlIIIlIIlIlIIlllIl;
    private int llIIIlIlIllIIlIlIlII;
    private lIllllIllIllIIllllll lllllIlIIIlIlIIlllII;
    private String lIllllllIIllIlIlIlII;
    private net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl llIIlllIIlllIIllIllI;
    private lllllIIIIIlIlIIIIIIl IIlllIIIlIlllIIlllII;
    
    public IIlIIIIIllIlIIIlIIll(final IlIIIlIlIIIllIlIlIIl iIlllIlIIllIlIlIlIIl, final String iiiIlllIIIIIIlIIIlll) {
        this.lllIIIIlllllIlIIllIl = new ArrayList();
        this.IlIlIIIIIIlllIlIllIl = false;
        this.IIllIIllIIIlIlIIIIlI = 1.0f;
        this.IIIlIIIlIlIIlllIIlll = 1.0f;
        this.IlIlIIIlIIlIlIIlllIl = 1.0f;
        this.lllllIlIIIlIlIIlllII = null;
        this.lIllllllIIllIlIlIlII = null;
        this.IIlllIIIlIlllIIlllII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl();
        this.llllIIIIlIIIlIlllIll = 64.0f;
        this.IlIlIlIlIlllllllllIl = 32.0f;
        this.llIIlIIIlIIIllIlIIIl = true;
        this.lIlIlIIIllIIllIIIllI = Lists.newArrayList();
        this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
        iIlllIlIIllIlIlIlIIl.lIIIIlIIIIIlllIllIII.add(this);
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.IlIlIlIlIlllllllllIl(iIlllIlIIllIlIlIlIIl.lIIIlllIIIllIIIllIII, iIlllIlIIllIlIlIlIIl.llIIlIIIlIIIllIlIIIl);
    }
    
    public IIlIIIIIllIlIIIlIIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this(ilIIIlIlIIIllIlIlIIl, null);
    }
    
    public IIlIIIIIllIlIIIlIIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final int n2) {
        this(ilIIIlIlIIIllIlIlIIl);
        this.llllIIIIlIIIlIlllIll(n, n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        if (this.IlIlIIIllIIllIlllllI == null) {
            this.IlIlIIIllIIllIlllllI = Lists.newArrayList();
        }
        this.IlIlIIIllIIllIlllllI.add(ilIIIIIllIlIIIlIIll);
    }
    
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final int illlllllIIIlIIIlIlII, final int iIlIIIIlllIlllllIlII) {
        this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
        return this;
    }
    
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(String string, final float n, final float n2, final float n3, final int n4, final int n5, final int n6) {
        string = String.valueOf(this.IIIIlllIIIIIIlIIIlll) + "." + string;
        final IIlIIIlllIllIllIlIII llllIIIIlIIIlIlllIll = this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(string);
        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        this.lIlIlIIIllIIllIIIllI.add(new llIIlIIIlIIIllIlIIIl(this, this.IlllllllIIIlIIIlIlII, this.IIlIIIIlllIlllllIlII, n, n2, n3, n4, n5, n6, 0.0f).llllIIIIlIIIlIlllIll(string));
        return this;
    }
    
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final int n4, final int n5, final int n6) {
        this.lIlIlIIIllIIllIIIllI.add(new llIIlIIIlIIIllIlIIIl(this, this.IlllllllIIIlIIIlIlII, this.IIlIIIIlllIlllllIlII, n, n2, n3, n4, n5, n6, 0.0f));
        return this;
    }
    
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final int n4, final int n5, final int n6, final boolean b) {
        this.lIlIlIIIllIIllIIIllI.add(new llIIlIIIlIIIllIlIIIl(this, this.IlllllllIIIlIIIlIlII, this.IIlIIIIlllIlllllIlII, n, n2, n3, n4, n5, n6, 0.0f, b));
        return this;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final int n4, final int n5, final int n6, final float n7) {
        this.lIlIlIIIllIIllIIIllI.add(new llIIlIIIlIIIllIlIIIl(this, this.IlllllllIIIlIIIlIlII, this.IIlIIIIlllIlllllIlII, n, n2, n3, n4, n5, n6, n7));
    }
    
    public void llllIIIIlIIIlIlllIll(final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        if (!this.llIllIlIIIIllIlIIllI && this.llIIlIIIlIIIllIlIIIl) {
            this.IlIlIIIllIllIIIIIllI();
            if (!this.IIIlIIlIIIIlllIlllII) {
                this.IlIIIlIlIIIllIlIlIIl(n);
            }
            int iiiiIllIIIIlIIIIllIl = 0;
            if (this.lllllIlIIIlIlIIlllII != null && !this.IIlllIIIlIlllIIlllII.lIIIIlIIIIIlllIllIII) {
                if (this.IIlllIIIlIlllIIlllII.lIIIlllIIIllIIIllIII) {
                    return;
                }
                iiiiIllIIIIlIIIIllIl = net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIIllIIIIlIIIIllIl();
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI().llllIIIIlIIIlIlllIll(this.lllllIlIIIlIlIIlllII);
            }
            if (this.llIIlllIIlllIIllIllI != null) {
                this.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll();
            }
            final boolean b = this.IIllIIllIIIlIlIIIIlI != 1.0f || this.IIIlIIIlIlIIlllIIlll != 1.0f || this.IlIlIIIlIIlIlIIlllIl != 1.0f;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, this.IIlllIIlIllIllIlIIll);
            if (this.IllIIlllIIIIlllIIlIl == 0.0f && this.llllIIIlIlllIlIIIIIl == 0.0f && this.lIIIIlIIIIIlllIllIII == 0.0f) {
                if (this.llIllIIIIIllIlIIIIlI == 0.0f && this.IlIIIlIlIIIllIlIlIIl == 0.0f && this.IlIlIIIllIllIIIIIllI == 0.0f) {
                    if (b) {
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IIIlIIIlIlIIlllIIlll, this.IlIlIIIlIIlIlIIlllIl);
                    }
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII(this.IlIlIllllllllIIIIlII);
                    if (this.IlIlIIIllIIllIlllllI != null) {
                        for (int i = 0; i < this.IlIlIIIllIIllIlllllI.size(); ++i) {
                            ((IIlIIIIIllIlIIIlIIll)this.IlIlIIIllIIllIlllllI.get(i)).llllIIIIlIIIlIlllIll(n);
                        }
                    }
                    if (b) {
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f / this.IIllIIllIIIlIlIIIIlI, 1.0f / this.IIIlIIIlIlIIlllIIlll, 1.0f / this.IlIlIIIlIIlIlIIlllIl);
                    }
                }
                else {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI * n, this.IlIIIlIlIIIllIlIlIIl * n, this.IlIlIIIllIllIIIIIllI * n);
                    if (b) {
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IIIlIIIlIlIIlllIIlll, this.IlIlIIIlIIlIlIIlllIl);
                    }
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII(this.IlIlIllllllllIIIIlII);
                    if (this.IlIlIIIllIIllIlllllI != null) {
                        for (int j = 0; j < this.IlIlIIIllIIllIlllllI.size(); ++j) {
                            ((IIlIIIIIllIlIIIlIIll)this.IlIlIIIllIIllIlllllI.get(j)).llllIIIIlIIIlIlllIll(n);
                        }
                    }
                    if (b) {
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f / this.IIllIIllIIIlIlIIIIlI, 1.0f / this.IIIlIIIlIlIIlllIIlll, 1.0f / this.IlIlIIIlIIlIlIIlllIl);
                    }
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.llIllIIIIIllIlIIIIlI * n, -this.IlIIIlIlIIIllIlIlIIl * n, -this.IlIlIIIllIllIIIIIllI * n);
                }
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI * n, this.IlIIIlIlIIIllIlIlIIl * n, this.IlIlIIIllIllIIIIIllI * n);
                if (this.lIIIIlIIIIIlllIllIII != 0.0f) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII * 57.295776f, 0.0f, 0.0f, 1.0f);
                }
                if (this.llllIIIlIlllIlIIIIIl != 0.0f) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl * 57.295776f, 0.0f, 1.0f, 0.0f);
                }
                if (this.IllIIlllIIIIlllIIlIl != 0.0f) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl * 57.295776f, 1.0f, 0.0f, 0.0f);
                }
                if (b) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IIIlIIIlIlIIlllIIlll, this.IlIlIIIlIIlIlIIlllIl);
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII(this.IlIlIllllllllIIIIlII);
                if (this.IlIlIIIllIIllIlllllI != null) {
                    for (int k = 0; k < this.IlIlIIIllIIllIlllllI.size(); ++k) {
                        ((IIlIIIIIllIlIIIlIIll)this.IlIlIIIllIIllIlllllI.get(k)).llllIIIIlIIIlIlllIll(n);
                    }
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.llllIIllllIlIlIIIIll, -this.IlIllIlIlIIIlIlIlIII, -this.IIlllIIlIllIllIlIIll);
            if (iiiiIllIIIIlIIIIllIl != 0) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(iiiiIllIIIIlIIIIllIl);
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final float n) {
        if (!this.llIllIlIIIIllIlIIllI && this.llIIlIIIlIIIllIlIIIl) {
            this.IlIlIIIllIllIIIIIllI();
            if (!this.IIIlIIlIIIIlllIlllII) {
                this.IlIIIlIlIIIllIlIlIIl(n);
            }
            int iiiiIllIIIIlIIIIllIl = 0;
            if (this.lllllIlIIIlIlIIlllII != null && !this.IIlllIIIlIlllIIlllII.lIIIIlIIIIIlllIllIII) {
                if (this.IIlllIIIlIlllIIlllII.lIIIlllIIIllIIIllIII) {
                    return;
                }
                iiiiIllIIIIlIIIIllIl = net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIIllIIIIlIIIIllIl();
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI().llllIIIIlIIIlIlllIll(this.lllllIlIIIlIlIIlllII);
            }
            if (this.llIIlllIIlllIIllIllI != null) {
                this.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll();
            }
            final boolean b = this.IIllIIllIIIlIlIIIIlI != 1.0f || this.IIIlIIIlIlIIlllIIlll != 1.0f || this.IlIlIIIlIIlIlIIlllIl != 1.0f;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI * n, this.IlIIIlIlIIIllIlIlIIl * n, this.IlIlIIIllIllIIIIIllI * n);
            if (this.llllIIIlIlllIlIIIIIl != 0.0f) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (this.IllIIlllIIIIlllIIlIl != 0.0f) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
            if (this.lIIIIlIIIIIlllIllIII != 0.0f) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            if (b) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IIIlIIIlIlIIlllIIlll, this.IlIlIIIlIIlIlIIlllIl);
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII(this.IlIlIllllllllIIIIlII);
            if (this.IlIlIIIllIIllIlllllI != null) {
                for (int i = 0; i < this.IlIlIIIllIIllIlllllI.size(); ++i) {
                    ((IIlIIIIIllIlIIIlIIll)this.IlIlIIIllIIllIlllllI.get(i)).llllIIIIlIIIlIlllIll(n);
                }
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            if (iiiiIllIIIIlIIIIllIl != 0) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(iiiiIllIIIIlIIIIllIl);
            }
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final float n) {
        if (!this.llIllIlIIIIllIlIIllI && this.llIIlIIIlIIIllIlIIIl) {
            this.IlIlIIIllIllIIIIIllI();
            if (!this.IIIlIIlIIIIlllIlllII) {
                this.IlIIIlIlIIIllIlIlIIl(n);
            }
            if (this.IllIIlllIIIIlllIIlIl == 0.0f && this.llllIIIlIlllIlIIIIIl == 0.0f && this.lIIIIlIIIIIlllIllIII == 0.0f) {
                if (this.llIllIIIIIllIlIIIIlI != 0.0f || this.IlIIIlIlIIIllIlIlIIl != 0.0f || this.IlIlIIIllIllIIIIIllI != 0.0f) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI * n, this.IlIIIlIlIIIllIlIlIIl * n, this.IlIlIIIllIllIIIIIllI * n);
                }
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI * n, this.IlIIIlIlIIIllIlIlIIl * n, this.IlIlIIIllIllIIIIIllI * n);
                if (this.lIIIIlIIIIIlllIllIII != 0.0f) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII * 57.295776f, 0.0f, 0.0f, 1.0f);
                }
                if (this.llllIIIlIlllIlIIIIIl != 0.0f) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl * 57.295776f, 0.0f, 1.0f, 0.0f);
                }
                if (this.IllIIlllIIIIlllIIlIl != 0.0f) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl * 57.295776f, 1.0f, 0.0f, 0.0f);
                }
            }
        }
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final float n) {
        if (this.IlIlIllllllllIIIIlII == 0) {
            this.IlIlIllllllllIIIIlII = net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(1);
        }
        GL11.glNewList(this.IlIlIllllllllIIIIlII, 4864);
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI();
        for (int i = 0; i < this.lIlIlIIIllIIllIIIllI.size(); ++i) {
            ((llIIlIIIlIIIllIlIIIl)this.lIlIlIIIllIIllIIIllI.get(i)).llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n);
        }
        for (int j = 0; j < this.lllIIIIlllllIlIIllIl.size(); ++j) {
            ((net.optifine.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl)this.lllIIIIlllllIlIIllIl.get(j)).llllIIIIlIIIlIlllIll(IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(), n);
        }
        GL11.glEndList();
        this.IIIlIIlIIIIlllIlllII = true;
    }
    
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl(final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll = (float)n;
        this.IlIlIlIlIlllllllllIl = (float)n2;
        return this;
    }
    
    public void IlIlIlIlIlllllllllIl(final float n, final float n2, final float n3, final int n4, final int n5, final int n6, final float n7) {
        this.lllIIIIlllllIlIIllIl.add(new net.optifine.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl(this, this.IlllllllIIIlIIIlIlII, this.IIlIIIIlllIlllllIlII, n, n2, n3, n4, n5, n6, n7));
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IIIlIIlIIIIlllIlllII;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIllllllllIIIIlII;
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        if (this.llIIIlIlIllIIlIlIlII != net.optifine.shaders.llIIlllIIlllIIllIllI.llIIlIIIlIIIllIlIIIl) {
            this.IIIlIIlIIIIlllIlllII = false;
            this.llIIIlIlIllIIlIlIlII = net.optifine.shaders.llIIlllIIlllIIllIllI.llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI() {
        return this.lllllIlIIIlIlIIlllII;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lllllIlIIIlIlIIlllII) {
        this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.lIllllllIIllIlIlIlII;
    }
    
    public void llllIIIIlIIIlIlllIll(final String lIllllllIIllIlIlIlII) {
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
    }
    
    public void llllIIIIlIIIlIlllIll(final int[][] array, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.lIlIlIIIllIIllIIIllI.add(new llIIlIIIlIIIllIlIIIl(this, array, n, n2, n3, n4, n5, n6, n7, this.lIIIlllIIIllIIIllIII));
    }
    
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl(final String s) {
        if (s == null) {
            return null;
        }
        if (this.IlIlIIIllIIllIlllllI != null) {
            for (int i = 0; i < this.IlIlIIIllIIllIlllllI.size(); ++i) {
                final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll = this.IlIlIIIllIIllIlllllI.get(i);
                if (s.equals(ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl())) {
                    return ilIIIIIllIlIIIlIIll;
                }
            }
        }
        return null;
    }
    
    public IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI(final String s) {
        if (s == null) {
            return null;
        }
        final IIlIIIIIllIlIIIlIIll ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(s);
        if (ilIlIlIlIlllllllllIl != null) {
            return ilIlIlIlIlllllllllIl;
        }
        if (this.IlIlIIIllIIllIlllllI != null) {
            for (int i = 0; i < this.IlIlIIIllIIllIlllllI.size(); ++i) {
                final IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI = this.IlIlIIIllIIllIlllllI.get(i).llIllIIIIIllIlIIIIlI(s);
                if (llIllIIIIIllIlIIIIlI != null) {
                    return llIllIIIIIllIlIIIIlI;
                }
            }
        }
        return null;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl llIIlllIIlllIIllIllI) {
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("id: " + this.lIllllllIIllIlIlIlII + ", boxes: " + ((this.lIlIlIIIllIIllIIIllI != null) ? Integer.valueOf(this.lIlIlIIIllIIllIIIllI.size()) : null) + ", submodels: " + ((this.IlIlIIIllIIllIlllllI != null) ? Integer.valueOf(this.IlIlIIIllIIllIlllllI.size()) : null));
        return sb.toString();
    }
}
