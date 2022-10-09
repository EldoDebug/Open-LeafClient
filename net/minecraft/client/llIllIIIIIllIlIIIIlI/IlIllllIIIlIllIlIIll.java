package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.logging.log4j.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.net.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;

public class IlIllllIIIlIllIlIIll extends lIIllIIIllllIlllIllI
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll("textures/gui/demo_background.png");
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        final int n = -16;
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 116, this.IlIllIlIlIIIlIlIlIII / 2 + 62 + n, 114, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("demo.help.buy", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(2, this.llllIIllllIlIlIIIIll / 2 + 2, this.IlIllIlIlIIIlIlIlIII / 2 + 62 + n, 114, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("demo.help.later", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        switch (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI) {
            case 1: {
                ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI = false;
                try {
                    final Class<?> forName = Class.forName("java.awt.Desktop");
                    forName.getMethod("browse", URI.class).invoke(forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]), new URI("http://www.minecraft.net/store?source=demo"));
                }
                catch (Throwable t) {
                    IlIllllIIIlIllIlIIll.IlIlIIIllIllIIIIIllI.error("Couldn't open link", t);
                }
                break;
            }
            case 2: {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
                this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll();
                break;
            }
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public void IlIlIIIllIIllIlllllI() {
        super.IlIlIIIllIIllIlllllI();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIllllIIIlIllIlIIll.IllIIlllIIIIlllIIlIl);
        this.IlIlIlIlIlllllllllIl((this.llllIIllllIlIlIIIIll - 248) / 2, (this.IlIllIlIlIIIlIlIlIII - 166) / 2, 0, 0, 248, 166);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        final int n4 = (this.llllIIllllIlIlIIIIll - 248) / 2 + 10;
        int n5 = (this.IlIllIlIlIIIlIlIlIII - 166) / 2 + 8;
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("demo.help.title", new Object[0]), n4, n5, 2039583);
        n5 += 12;
        final llllIIIIlIIIlIlllIll iiIlIIIlIlIIlllIIlll = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll;
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("demo.help.movementShort", net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.IIlIIIlllIllIllIlIII.lIIIlllIIIllIIIllIII()), net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.lIlIlIlllIIlIlIlllIl.lIIIlllIIIllIIIllIII()), net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.llIIIIIIlIllIIlIIIll.lIIIlllIIIllIIIllIII()), net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII())), n4, n5, 5197647);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("demo.help.movementMouse", new Object[0]), n4, n5 + 12, 5197647);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("demo.help.jump", net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.llIIIlIlllIllIIlIllI.lIIIlllIIIllIIIllIII())), n4, n5 + 24, 5197647);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("demo.help.inventory", net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.IllIIlllllIIllIIllIl.lIIIlllIIIllIIIllIII())), n4, n5 + 36, 5197647);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("demo.help.fullWrapped", new Object[0]), n4, n5 + 68, 218, 2039583);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
