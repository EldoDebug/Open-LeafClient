package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import leaf.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IllIllIlllIllllIIllI extends llIllIIIIIllIlIIIIlI
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private final Minecraft IllIIlllIIIIlllIIlIl;
    private final List llllIIIlIlllIlIIIIIl;
    private final List lIIIIlIIIIIlllIllIII;
    private final List lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
    }
    
    public IllIllIlllIllllIIllI(final Minecraft illIIlllIIIIlllIIlIl) {
        this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
        this.lIIIIlIIIIIlllIllIII = Lists.newArrayList();
        this.lIIIlllIIIllIIIllIII = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IlIlIIIllIIllIlllllI != net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            final int liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII();
            final int size = this.lIIIlllIIIllIIIllIII.size();
            final float n2 = this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IIlllIIlIllIllIlIIll * 0.9f + 0.1f;
            if (size > 0) {
                final boolean ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
                final float liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
                final int illIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(this.IllIIlllIIIIlllIIlIl() / liiiIlIIIIIlllIllIII);
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(2.0f, 20.0f, 0.0f);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, liiiIlIIIIIlllIllIII, 1.0f);
                for (int n3 = 0; n3 + this.llIIlIIIlIIIllIlIIIl < this.lIIIlllIIIllIIIllIII.size() && n3 < liiIlllIIIllIIIllIII; ++n3) {
                    final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.lIIIlllIIIllIIIllIII.get(n3 + this.llIIlIIIlIIIllIlIIIl);
                    if (llllIIIIlIIIlIlllIll != null && (n - llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() < 200 || ilIlIIIllIllIIIIIllI)) {
                        final int n4 = (int)(255.0f * n2);
                        final int n5 = -n3 * 9;
                        final String liiIlllIIIllIIIllIII2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII();
                        if (!Leaf.instance.modManager.chatMod.background) {
                            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, n5 - 9, 0 + illIIlllIIIIlllIIlIl + 4, n5, n4 / 2 << 24);
                        }
                        if (Leaf.instance.modManager.chatMod.detect && liiIlllIIIllIIIllIII2.contains(Minecraft.getMinecraft().IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI())) {
                            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, n5 - 9, 0 + illIIlllIIIIlllIIlIl + 4, n5, Leaf.instance.modManager.chatMod.getIntColor());
                        }
                        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                        this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII2, 0.0f, (float)(n5 - 8), 16777215 + (n4 << 24));
                        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                    }
                }
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.lIIIlllIIIllIIIllIII.clear();
        this.lIIIIlIIIIIlllIllIII.clear();
        this.llllIIIlIlllIlIIIIIl.clear();
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll, 0);
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final int n) {
        this.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll, n, this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI(), false);
        IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI.info("[CHAT] " + llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII());
    }
    
    private void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final int n, final int n2, final boolean b) {
        if (n != 0) {
            this.llIllIIIIIllIlIIIIlI(n);
        }
        final List llllIIIIlIIIlIlllIll = IlIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll, llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.IllIIlllIIIIlllIIlIl() / this.lIIIIlIIIIIlllIllIII()), this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI, false, false);
        final boolean ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
        for (final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll2 : llllIIIIlIIIlIlllIll) {
            if (ilIlIIIllIllIIIIIllI && this.llIIlIIIlIIIllIlIIIl > 0) {
                this.llIllIlIIIIllIlIIllI = true;
                this.IlIlIlIlIlllllllllIl(1);
            }
            this.lIIIlllIIIllIIIllIII.add(0, new llllIIIIlIIIlIlllIll(n2, llIIIIIIlIllIIlIIIll2, n));
        }
        while (this.lIIIlllIIIllIIIllIII.size() > 100) {
            this.lIIIlllIIIllIIIllIII.remove(this.lIIIlllIIIllIIIllIII.size() - 1);
        }
        if (!b) {
            this.lIIIIlIIIIIlllIllIII.add(0, new llllIIIIlIIIlIlllIll(n2, llIIIIIIlIllIIlIIIll, n));
            while (this.lIIIIlIIIIIlllIllIII.size() > 100) {
                this.lIIIIlIIIIIlllIllIII.remove(this.lIIIIlIIIIIlllIllIII.size() - 1);
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.lIIIlllIIIllIIIllIII.clear();
        this.IlIIIlIlIIIllIlIlIIl();
        for (int i = this.lIIIIlIIIIIlllIllIII.size() - 1; i >= 0; --i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII.get(i);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), true);
        }
    }
    
    public List llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        if (this.llllIIIlIlllIlIIIIIl.isEmpty() || !this.llllIIIlIlllIlIIIIIl.get(this.llllIIIlIlllIlIIIIIl.size() - 1).equals(s)) {
            this.llllIIIlIlllIlIIIIIl.add(s);
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llIIlIIIlIIIllIlIIIl = 0;
        this.llIllIlIIIIllIlIIllI = false;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        this.llIIlIIIlIIIllIlIIIl += n;
        final int size = this.lIIIlllIIIllIIIllIII.size();
        if (this.llIIlIIIlIIIllIlIIIl > size - this.lIIIlllIIIllIIIllIII()) {
            this.llIIlIIIlIIIllIlIIIl = size - this.lIIIlllIIIllIIIllIII();
        }
        if (this.llIIlIIIlIIIllIlIIIl <= 0) {
            this.llIIlIIIlIIIllIlIIIl = 0;
            this.llIllIlIIIIllIlIIllI = false;
        }
    }
    
    public llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (!this.IlIlIIIllIllIIIIIllI()) {
            return null;
        }
        final int ilIlIIIllIllIIIIIllI = new g(this.IllIIlllIIIIlllIIlIl).IlIlIIIllIllIIIIIllI();
        final float liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        final int n3 = n / ilIlIIIllIllIIIIIllI - 3;
        final int n4 = n2 / ilIlIIIllIllIIIIIllI - 27;
        final int ilIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n3 / liiiIlIIIIIlllIllIII);
        final int ilIIIlIlIIIllIlIlIIl2 = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n4 / liiiIlIIIIIlllIllIII);
        if (ilIIIlIlIIIllIlIlIIl < 0 || ilIIIlIlIIIllIlIlIIl2 < 0) {
            return null;
        }
        final int min = Math.min(this.lIIIlllIIIllIIIllIII(), this.lIIIlllIIIllIIIllIII.size());
        if (ilIIIlIlIIIllIlIlIIl <= llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.IllIIlllIIIIlllIIlIl() / this.lIIIIlIIIIIlllIllIII()) && ilIIIlIlIIIllIlIlIIl2 < this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll * min + min) {
            final int n5 = ilIIIlIlIIIllIlIlIIl2 / this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll + this.llIIlIIIlIIIllIlIIIl;
            if (n5 >= 0 && n5 < this.lIIIlllIIIllIIIllIII.size()) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.lIIIlllIIIllIIIllIII.get(n5);
                int n6 = 0;
                for (final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll : llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) {
                    if (llIIIIIIlIllIIlIIIll instanceof IlIlIIIIIIlllIlIllIl) {
                        n6 += this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(((IlIlIIIIIIlllIlIllIl)llIIIIIIlIllIIlIIIll).llllIIIIlIIIlIlllIll(), false));
                        if (n6 > ilIIIlIlIIIllIlIlIIl) {
                            return llIIIIIIlIllIIlIIIll;
                        }
                        continue;
                    }
                }
            }
            return null;
        }
        return null;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll instanceof llllIIIlIlllIlIIIIIl;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int n) {
        final Iterator<llllIIIIlIIIlIlllIll> iterator = (Iterator<llllIIIIlIIIlIlllIll>)this.lIIIlllIIIllIIIllIII.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().llIllIIIIIllIlIIIIlI() == n) {
                iterator.remove();
            }
        }
        final Iterator<llllIIIIlIIIlIlllIll> iterator2 = (Iterator<llllIIIIlIIIlIlllIll>)this.lIIIIlIIIIIlllIllIII.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().llIllIIIIIllIlIIIIlI() == n) {
                iterator2.remove();
                break;
            }
        }
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IIlllIIIlIlllIIlllII);
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI() ? this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.llllllIllIllIlIllllI : this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IIlIIIIIllIlIIIlIIll);
    }
    
    public float lIIIIlIIIIIlllIllIII() {
        return this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.llIIlllIIlllIIllIllI;
    }
    
    public static int llllIIIIlIIIlIlllIll(final float n) {
        final int n2 = 320;
        final int n3 = 40;
        return llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n * (n2 - n3) + n3);
    }
    
    public static int IlIlIlIlIlllllllllIl(final float n) {
        final int n2 = 180;
        final int n3 = 20;
        return llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n * (n2 - n3) + n3);
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.llllIIIlIlllIlIIIIIl() / 9;
    }
}
