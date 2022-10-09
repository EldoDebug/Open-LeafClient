package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.net.*;
import org.lwjgl.*;
import java.util.*;
import java.io.*;

public class IIIIIIIllllIlIIIIIII extends lIIllIIIllllIlllIllI
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private final lIIllIIIllllIlllIllI IllIIlllIIIIlllIIlIl;
    private List llllIIIlIlllIlIIIIIl;
    private List lIIIIlIIIIIlllIllIII;
    private IIlllllIllIllIlIlIII lIIIlllIIIllIIIllIII;
    private IIlIlIllllIlllIIIIll llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
    }
    
    public IIIIIIIllllIlIIIIIII(final lIIllIIIllllIlllIllI illIIlllIIIIlllIIlIl) {
        this.llIllIlIIIIllIlIIllI = false;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(2, this.llllIIllllIlIlIIIIll / 2 - 154, this.IlIllIlIlIIIlIlIlIII - 48, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("resourcePack.openFolder", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(1, this.llllIIllllIlIlIIIIll / 2 + 4, this.IlIllIlIlIIIlIlIlIII - 48, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        if (!this.llIllIlIIIIllIlIIllI) {
            this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
            this.lIIIIlIIIIIlllIllIII = Lists.newArrayList();
            final IIIlIIlIIIIlllIlllII iIlIlIlIIlIllIIIIIIl = this.IlIlIIIllIIllIlllllI.IIlIlIlIIlIllIIIIIIl();
            iIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll();
            final ArrayList arrayList = Lists.newArrayList((Iterable)iIlIlIlIIlIllIIIIIIl.IlIlIlIlIlllllllllIl());
            arrayList.removeAll(iIlIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI());
            final Iterator<lllllIlIIIlIlIIlllII> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                this.llllIIIlIlllIlIIIIIl.add(new IIlIIIIlllIlllllIlII(this, iterator.next()));
            }
            final Iterator iterator2 = Lists.reverse(iIlIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI()).iterator();
            while (iterator2.hasNext()) {
                this.lIIIIlIIIIIlllIllIII.add(new IIlIIIIlllIlllllIlII(this, iterator2.next()));
            }
            this.lIIIIlIIIIIlllIllIII.add(new IlllllllIIIlIIIlIlII(this));
        }
        (this.lIIIlllIIIllIIIllIII = new IIlllllIllIllIlIlIII(this.IlIlIIIllIIllIlllllI, 200, this.IlIllIlIlIIIlIlIlIII, this.llllIIIlIlllIlIIIIIl)).lIIIIlIIIIIlllIllIII(this.llllIIllllIlIlIIIIll / 2 - 4 - 200);
        this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl(7, 8);
        (this.llIIlIIIlIIIllIlIIIl = new IIlIlIllllIlllIIIIll(this.IlIlIIIllIIllIlllllI, 200, this.IlIllIlIlIIIlIlIlIII, this.lIIIIlIIIIIlllIllIII)).lIIIIlIIIIIlllIllIII(this.llllIIllllIlIlIIIIll / 2 + 4);
        this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl(7, 8);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII();
        this.lIIIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        return this.lIIIIlIIIIIlllIllIII.contains(iiIlIIIlIlIIlllIIlll);
    }
    
    public List IlIlIlIlIlllllllllIl(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        return this.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll) ? this.lIIIIlIIIIIlllIllIII : this.llllIIIlIlllIlIIIIIl;
    }
    
    public List IlIlIIIllIllIIIIIllI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public List llllIIIlIlllIlIIIIIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 2) {
                final File ilIIIlIlIIIllIlIlIIl2 = this.IlIlIIIllIIllIlllllI.IIlIlIlIIlIllIIIIIIl().IlIIIlIlIIIllIlIlIIl();
                final String absolutePath = ilIIIlIlIIIllIlIlIIl2.getAbsolutePath();
                Label_0135: {
                    if (net.minecraft.IlllllllIIIlIIIlIlII.c.llllIIIIlIIIlIlllIll() == d.IlIIIlIlIIIllIlIlIIl) {
                        try {
                            IIIIIIIllllIlIIIIIII.IlIlIIIllIllIIIIIllI.info(absolutePath);
                            Runtime.getRuntime().exec(new String[] { "/usr/bin/open", absolutePath });
                            return;
                        }
                        catch (IOException ex) {
                            IIIIIIIllllIlIIIIIII.IlIlIIIllIllIIIIIllI.error("Couldn't open file", (Throwable)ex);
                            break Label_0135;
                        }
                    }
                    if (net.minecraft.IlllllllIIIlIIIlIlII.c.llllIIIIlIIIlIlllIll() == d.llIllIIIIIllIlIIIIlI) {
                        final String format = String.format("cmd.exe /C start \"Open file\" \"%s\"", absolutePath);
                        try {
                            Runtime.getRuntime().exec(format);
                            return;
                        }
                        catch (IOException ex2) {
                            IIIIIIIllllIlIIIIIII.IlIlIIIllIllIIIIIllI.error("Couldn't open file", (Throwable)ex2);
                        }
                    }
                }
                boolean b = false;
                try {
                    final Class<?> forName = Class.forName("java.awt.Desktop");
                    forName.getMethod("browse", URI.class).invoke(forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]), ilIIIlIlIIIllIlIlIIl2.toURI());
                }
                catch (Throwable t) {
                    IIIIIIIllllIlIIIIIII.IlIlIIIllIllIIIIIllI.error("Couldn't open link", t);
                    b = true;
                }
                if (b) {
                    IIIIIIIllllIlIIIIIII.IlIlIIIllIllIIIIIllI.info("Opening via system class!");
                    Sys.openURL("file://" + absolutePath);
                }
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                if (this.llIllIlIIIIllIlIIllI) {
                    final ArrayList arrayList = Lists.newArrayList();
                    for (final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll : this.lIIIIlIIIIIlllIllIII) {
                        if (iiIlIIIlIlIIlllIIlll instanceof IIlIIIIlllIlllllIlII) {
                            arrayList.add(((IIlIIIIlllIlllllIlII)iiIlIIIlIlIIlllIIlll).llIIlIIIlIIIllIlIIIl());
                        }
                    }
                    Collections.reverse(arrayList);
                    this.IlIlIIIllIIllIlllllI.IIlIlIlIIlIllIIIIIIl().llllIIIIlIIIlIlllIll(arrayList);
                    this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llIllIlIIIIllIlIIllI.clear();
                    this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lIlIlIIIllIIllIIIllI.clear();
                    for (final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII : arrayList) {
                        this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llIllIlIIIIllIlIIllI.add(lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl());
                        if (lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl() != 1) {
                            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lIlIlIIIllIIllIIIllI.add(lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl());
                        }
                    }
                    this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                    this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI();
                }
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(n, n2, n3);
        this.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(n, n2, n3);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        super.IlIlIlIlIlllllllllIl(n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.llIllIIIIIllIlIIIIlI(0);
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("resourcePack.title", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 16, 16777215);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("resourcePack.folderInfo", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 77, this.IlIllIlIlIIIlIlIlIII - 26, 8421504);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        this.llIllIlIIIIllIlIIllI = true;
    }
}
