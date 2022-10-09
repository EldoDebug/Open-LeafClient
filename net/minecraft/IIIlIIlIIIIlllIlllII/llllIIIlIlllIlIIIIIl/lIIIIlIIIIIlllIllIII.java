package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import java.io.*;

public class lIIIIlIIIIIlllIllIII
{
    private IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    protected Map llllIIIIlIIIlIlllIll;
    private List llIllIIIIIllIlIIIIlI;
    private Map IlIIIlIlIIIllIlIlIIl;
    
    public lIIIIlIIIIIlllIllIII(final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIlIlIlIlllllllllIl();
    }
    
    public llllllIllIllIlIllllI llllIIIIlIIIlIlllIll(final Class clazz, final String s) {
        llllllIllIllIlIllllI llllllIllIllIlIllllI = this.llllIIIIlIIIlIlllIll.get(s);
        if (llllllIllIllIlIllllI != null) {
            return llllllIllIllIlIllllI;
        }
        if (this.IlIlIlIlIlllllllllIl != null) {
            try {
                final File llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(s);
                if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.exists()) {
                    try {
                        llllllIllIllIlIllllI = clazz.getConstructor(String.class).newInstance(s);
                    }
                    catch (Exception ex) {
                        throw new RuntimeException("Failed to instantiate " + clazz.toString(), ex);
                    }
                    final FileInputStream fileInputStream = new FileInputStream(llllIIIIlIIIlIlllIll);
                    final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(fileInputStream);
                    fileInputStream.close();
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI("data"));
                }
            }
            catch (Exception ex2) {
                ex2.printStackTrace();
            }
        }
        if (llllllIllIllIlIllllI != null) {
            this.llllIIIIlIIIlIlllIll.put(s, llllllIllIllIlIllllI);
            this.llIllIIIIIllIlIIIIlI.add(llllllIllIllIlIllllI);
        }
        return llllllIllIllIlIllllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        if (this.llllIIIIlIIIlIlllIll.containsKey(s)) {
            this.llIllIIIIIllIlIIIIlI.remove(this.llllIIIIlIIIlIlllIll.remove(s));
        }
        this.llllIIIIlIIIlIlllIll.put(s, llllllIllIllIlIllllI);
        this.llIllIIIIIllIlIIIIlI.add(llllllIllIllIlIllllI);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.size(); ++i) {
            final llllllIllIllIlIllllI llllllIllIllIlIllllI = this.llIllIIIIIllIlIIIIlI.get(i);
            if (llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI()) {
                this.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
                llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(false);
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        if (this.IlIlIlIlIlllllllllIl != null) {
            try {
                final File llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll);
                if (llllIIIIlIIIlIlllIll != null) {
                    final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                    llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(iiiIlllIIIIIIlIIIlll);
                    final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
                    iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("data", iiiIlllIIIIIIlIIIlll);
                    final FileOutputStream fileOutputStream = new FileOutputStream(llllIIIIlIIIlIlllIll);
                    net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2, fileOutputStream);
                    fileOutputStream.close();
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl() {
        try {
            this.IlIIIlIlIIIllIlIlIIl.clear();
            if (this.IlIlIlIlIlllllllllIl == null) {
                return;
            }
            final File llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("idcounts");
            if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.exists()) {
                final DataInputStream dataInputStream = new DataInputStream(new FileInputStream(llllIIIIlIIIlIlllIll));
                final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(dataInputStream);
                dataInputStream.close();
                for (final String s : llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI()) {
                    final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(s);
                    if (llllIIIIlIIIlIlllIll3 instanceof IIlIIIIlllIlllllIlII) {
                        this.IlIIIlIlIIIllIlIlIIl.put(s, ((IIlIIIIlllIlllllIlII)llllIIIIlIIIlIlllIll3).llllIIIlIlllIlIIIIIl());
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int llllIIIIlIIIlIlllIll(final String s) {
        final Short n = this.IlIIIlIlIIIllIlIlIIl.get(s);
        Short n2;
        if (n == null) {
            n2 = 0;
        }
        else {
            n2 = (short)(n + 1);
        }
        this.IlIIIlIlIIIllIlIlIIl.put(s, n2);
        if (this.IlIlIlIlIlllllllllIl == null) {
            return n2;
        }
        try {
            final File llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("idcounts");
            if (llllIIIIlIIIlIlllIll != null) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                for (final String s2 : this.IlIIIlIlIIIllIlIlIIl.keySet()) {
                    iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s2, (short)this.IlIIIlIlIIIllIlIlIIl.get(s2));
                }
                final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(llllIIIIlIIIlIlllIll));
                net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, (DataOutput)dataOutputStream);
                dataOutputStream.close();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return n2;
    }
}
