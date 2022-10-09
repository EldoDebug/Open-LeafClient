package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import org.apache.logging.log4j.*;
import org.lwjgl.input.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.util.*;
import com.google.common.base.*;
import com.google.common.collect.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import leaf.*;

public class IlIllllIIlIIlIlIlIll extends lIIllIIIllllIlllIllI implements c
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private final IlIllIlIlIIIlIlIlIII IllIIlllIIIIlllIIlIl;
    private m llllIIIlIlllIlIIIIIl;
    private lIIIIlIIIIIlllIllIII lIIIIlIIIIIlllIllIII;
    private IlIIIlIlIIIllIlIlIIl lIIIlllIIIllIIIllIII;
    private IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl;
    private IlIIIlIlIIIllIlIlIIl llIllIlIIIIllIlIIllI;
    private boolean lIlIlIIIllIIllIIIllI;
    private boolean IIIlIIIlIlIIlllIIlll;
    private boolean IlIlIIIlIIlIlIIlllIl;
    private boolean IlllllllIIIlIIIlIlII;
    private String IIlIIIIlllIlllllIlII;
    private IllIIlllIIIIlllIIlIl IIIlIIlIIIIlllIlllII;
    private net.minecraft.client.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI IlIlIllllllllIIIIlII;
    private net.minecraft.client.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl IIlllIlIIllIlIlIlIIl;
    private boolean llIIIlIlIllIIlIlIlII;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
    }
    
    public IlIllllIIlIIlIlIlIll() {
        this.IllIIlllIIIIlllIIlIl = new IlIllIlIlIIIlIlIlIII();
    }
    
    @Override
    public void n_() {
        Keyboard.enableRepeatEvents(true);
        this.IIlllIIlIllIllIlIIll.clear();
        if (!this.llIIIlIlIllIIlIlIlII) {
            this.llIIIlIlIllIIlIlIlII = true;
            (this.lIIIIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII(this.IlIlIIIllIIllIlllllI)).llllIIIIlIIIlIlllIll();
            this.IlIlIllllllllIIIIlII = new net.minecraft.client.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
            try {
                (this.IIlllIlIIllIlIlIlIIl = new net.minecraft.client.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(this.IlIlIllllllllIIIIlII)).start();
            }
            catch (Exception ex) {
                IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI.warn("Unable to start LAN server detection: " + ex.getMessage());
            }
            (this.llllIIIlIlllIlIIIIIl = new m(this, this.IlIlIIIllIIllIlllllI, this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, 32, this.IlIllIlIlIIIlIlIlIII - 64, 36)).llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        }
        else {
            this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, 32, this.IlIllIlIlIIIlIlIlIII - 64);
        }
        this.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII();
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.IIlllIIlIllIllIlIIll.add(this.lIIIlllIIIllIIIllIII = new IlIIIlIlIIIllIlIlIIl(7, this.llllIIllllIlIlIIIIll / 2 - 154, this.IlIllIlIlIIIlIlIlIII - 28, 70, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.edit", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.llIllIlIIIIllIlIIllI = new IlIIIlIlIIIllIlIlIIl(2, this.llllIIllllIlIlIIIIll / 2 - 74, this.IlIllIlIlIIIlIlIlIII - 28, 70, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.delete", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.llIIlIIIlIIIllIlIIIl = new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 154, this.IlIllIlIlIIIlIlIlIII - 52, 100, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.select", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(4, this.llllIIllllIlIlIIIIll / 2 - 50, this.IlIllIlIlIIIlIlIlIII - 52, 100, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.direct", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(3, this.llllIIllllIlIlIIIIll / 2 + 4 + 50, this.IlIllIlIlIIIlIlIlIII - 52, 100, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.add", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(8, this.llllIIllllIlIlIIIIll / 2 + 4, this.IlIllIlIlIIIlIlIlIII - 28, 70, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.refresh", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 + 4 + 76, this.IlIllIlIlIIIlIlIlIII - 28, 75, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl());
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        if (this.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll()) {
            final List llIllIIIIIllIlIIIIlI = this.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI();
            this.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl();
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        }
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
        if (this.IIlllIlIIllIlIlIlIIl != null) {
            this.IIlllIlIIllIlIlIlIIl.interrupt();
            this.IIlllIlIIllIlIlIlIIl = null;
        }
        this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI = (this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() < 0) ? null : this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl());
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 2 && iiiiiiiiIlllIllIlIlI instanceof k) {
                final String llllIIIIlIIIlIlllIll = ((k)iiiiiiiiIlllIllIlIlI).llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll;
                if (llllIIIIlIIIlIlllIll != null) {
                    this.lIlIlIIIllIIllIIIllI = true;
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new b(this, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.deleteQuestion", new Object[0]), "'" + llllIIIIlIIIlIlllIll + "' " + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.deleteWarning", new Object[0]), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.deleteButton", new Object[0]), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0]), this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl()));
                }
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.llllIIIlIlllIlIIIIIl();
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 4) {
                this.IlllllllIIIlIIIlIlII = true;
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IIlllIIIllIllIIlIlIl(this, this.IIIlIIlIIIIlllIlllII = new IllIIlllIIIIlllIIlIl(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.defaultName", new Object[0]), "", false)));
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 3) {
                this.IIIlIIIlIlIIlllIIlll = true;
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IllIlIllIllIlllIIlll(this, this.IIIlIIlIIIIlllIlllII = new IllIIlllIIIIlllIIlIl(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.defaultName", new Object[0]), "", false)));
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 7 && iiiiiiiiIlllIllIlIlI instanceof k) {
                this.IlIlIIIlIIlIlIIlllIl = true;
                final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll2 = ((k)iiiiiiiiIlllIllIlIlI).llllIIIIlIIIlIlllIll();
                (this.IIIlIIlIIIIlllIlllII = new IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl, false)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IllIlIllIllIlllIIlll(this, this.IIIlIIlIIIIlllIlllII));
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 8) {
                this.IIlllIIlIllIllIlIIll();
            }
        }
    }
    
    private void IIlllIIlIllIllIlIIll() {
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIllllIIlIIlIlIlIll());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI = (this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() < 0) ? null : this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl());
        if (this.lIlIlIIIllIIllIIIllI) {
            this.lIlIlIIIllIIllIIIllI = false;
            if (b && iiiiiiiiIlllIllIlIlI instanceof k) {
                this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl());
                this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
                this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(-1);
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
            }
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this);
        }
        else if (this.IlllllllIIIlIIIlIlII) {
            this.IlllllllIIIlIIIlIlII = false;
            if (b) {
                this.llllIIIIlIIIlIlllIll(this.IIIlIIlIIIIlllIlllII);
            }
            else {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this);
            }
        }
        else if (this.IIIlIIIlIlIIlllIIlll) {
            this.IIIlIIIlIlIIlllIIlll = false;
            if (b) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.IIIlIIlIIIIlllIlllII);
                this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
                this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(-1);
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
            }
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this);
        }
        else if (this.IlIlIIIlIIlIlIIlllIl) {
            this.IlIlIIIlIIlIlIIlllIl = false;
            if (b && iiiiiiiiIlllIllIlIlI instanceof k) {
                final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = ((k)iiiiiiiiIlllIllIlIlI).llllIIIIlIIIlIlllIll();
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll = this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl = this.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl;
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IIIlIIlIIIIlllIlllII);
                this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
            }
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        final int ilIIIlIlIIIllIlIlIIl = this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI = (ilIIIlIlIIIllIlIlIIl < 0) ? null : this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
        if (n == 63) {
            this.IIlllIIlIllIllIlIIll();
        }
        else if (ilIIIlIlIIIllIlIlIIl >= 0) {
            if (n == 200) {
                if (llllIIllllIlIlIIIIll()) {
                    if (ilIIIlIlIIIllIlIlIIl > 0 && iiiiiiiiIlllIllIlIlI instanceof k) {
                        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl - 1);
                        this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() - 1);
                        this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl(-this.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII());
                        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
                    }
                }
                else if (ilIIIlIlIIIllIlIlIIl > 0) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() - 1);
                    this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl(-this.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII());
                    if (this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl()) instanceof j) {
                        if (this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() > 0) {
                            this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() - 1);
                            this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl(-this.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII());
                        }
                        else {
                            this.llllIIIIlIIIlIlllIll(-1);
                        }
                    }
                }
                else {
                    this.llllIIIIlIIIlIlllIll(-1);
                }
            }
            else if (n == 208) {
                if (llllIIllllIlIlIIIIll()) {
                    if (ilIIIlIlIIIllIlIlIIl < this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI() - 1) {
                        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl + 1);
                        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl + 1);
                        this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl(this.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII());
                        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
                    }
                }
                else if (ilIIIlIlIIIllIlIlIIl < this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll()) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() + 1);
                    this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl(this.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII());
                    if (this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl()) instanceof j) {
                        if (this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() < this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() - 1) {
                            this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() + 1);
                            this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl(this.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII());
                        }
                        else {
                            this.llllIIIIlIIIlIlllIll(-1);
                        }
                    }
                }
                else {
                    this.llllIIIIlIIIlIlllIll(-1);
                }
            }
            else if (n != 28 && n != 156) {
                super.llllIIIIlIIIlIlllIll(c, n);
            }
            else {
                this.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll.get(2));
            }
        }
        else {
            super.llllIIIIlIIIlIlllIll(c, n);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IIlIIIIlllIlllllIlII = null;
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("multiplayer.title", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        if (this.IIlIIIIlllIlllllIlII != null) {
            this.llllIIIIlIIIlIlllIll(Lists.newArrayList(Splitter.on("\n").split((CharSequence)this.IIlIIIIlllIlllllIlII)), n, n2);
        }
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI = (this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() < 0) ? null : this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl());
        if (iiiiiiiiIlllIllIlIlI instanceof k) {
            this.llllIIIIlIIIlIlllIll(((k)iiiiiiiiIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        }
        else if (iiiiiiiiIlllIllIlIlI instanceof i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ((i)iiiiiiiiIlllIllIlIlI).llllIIIIlIIIlIlllIll();
            this.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), true));
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.minecraft.client.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this, this.IlIlIIIllIIllIlllllI, illIIlllIIIIlllIIlIl));
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(n);
        final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI = (n < 0) ? null : this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n);
        this.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI = false;
        this.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI = false;
        this.llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI = false;
        if (iiiiiiiiIlllIllIlIlI != null && !(iiiiiiiiIlllIllIlIlI instanceof j)) {
            this.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI = true;
            if (iiiiiiiiIlllIllIlIlI instanceof k) {
                this.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI = true;
                this.llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI = true;
            }
            if (Leaf.instance.downloadPlayerData.serverData.contains(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n).IlIlIlIlIlllllllllIl)) {
                this.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI = false;
                this.llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI = false;
            }
        }
    }
    
    public IlIllIlIlIIIlIlIlIII lIIIIlIIIIIlllIllIII() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String iIlIIIIlllIlllllIlII) {
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, n2, n3);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        super.IlIlIlIlIlllllllllIl(n, n2, n3);
        this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(n, n2, n3);
    }
    
    public lIIIIlIIIIIlllIllIII lIIIlllIIIllIIIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final k k, final int n) {
        return n > 0;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final k k, final int n) {
        return n < this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI() - 1;
    }
    
    public void llllIIIIlIIIlIlllIll(final k k, final int n, final boolean b) {
        final int n2 = b ? 0 : (n - 1);
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n, n2);
        if (this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() == n) {
            this.llllIIIIlIIIlIlllIll(n2);
        }
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
    }
    
    public void IlIlIlIlIlllllllllIl(final k k, final int n, final boolean b) {
        final int n2 = b ? (this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI() - 1) : (n + 1);
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n, n2);
        if (this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() == n) {
            this.llllIIIIlIIIlIlllIll(n2);
        }
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
    }
}
