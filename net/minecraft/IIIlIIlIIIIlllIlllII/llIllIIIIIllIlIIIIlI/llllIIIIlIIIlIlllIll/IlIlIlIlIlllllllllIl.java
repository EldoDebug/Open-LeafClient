package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import org.apache.commons.lang3.*;
import net.minecraft.client.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.io.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl extends llIllIlIIIIllIlIIllI
{
    private static final Logger IlIlIlIlIlllllllllIl;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public IlIlIlIlIlllllllllIl(final File file) {
        super(file);
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "Anvil";
    }
    
    @Override
    public List IlIlIlIlIlllllllllIl() {
        if (this.llllIIIIlIIIlIlllIll != null && this.llllIIIIlIIIlIlllIll.exists() && this.llllIIIIlIIIlIlllIll.isDirectory()) {
            final ArrayList arrayList = Lists.newArrayList();
            File[] listFiles;
            for (int length = (listFiles = this.llllIIIIlIIIlIlllIll.listFiles()).length, i = 0; i < length; ++i) {
                final File file = listFiles[i];
                if (file.isDirectory()) {
                    final String name = file.getName();
                    final llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(name);
                    if (llIllIIIIIllIlIIIIlI != null && (llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI() == 19132 || llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI() == 19133)) {
                        final boolean b = llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI() != this.llIllIIIIIllIlIIIIlI();
                        String llIIlIIIlIIIllIlIIIl = llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl();
                        if (StringUtils.isEmpty((CharSequence)llIIlIIIlIIIllIlIIIl)) {
                            llIIlIIIlIIIllIlIIIl = name;
                        }
                        arrayList.add(new llIIlIIIlIIIllIlIIIl(name, llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI(), 0L, llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll(), b, llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl(), llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll()));
                    }
                }
            }
            return arrayList;
        }
        throw new llllIIIIlIIIlIlllIll("Unable to read or access folder where game worlds are saved!");
    }
    
    protected int llIllIIIIIllIlIIIIlI() {
        return 19133;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        return new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll, s, b);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        final llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(s);
        return llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI() == 19132;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        final llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(s);
        return llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI() != this.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final String s, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(0);
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList();
        final ArrayList arrayList3 = Lists.newArrayList();
        final File file = new File(this.llllIIIIlIIIlIlllIll, s);
        final File file2 = new File(file, "DIM-1");
        final File file3 = new File(file, "DIM1");
        net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.info("Scanning folders...");
        this.llllIIIIlIIIlIlllIll(file, arrayList);
        if (file2.exists()) {
            this.llllIIIIlIIIlIlllIll(file2, arrayList2);
        }
        if (file3.exists()) {
            this.llllIIIIlIIIlIlllIll(file3, arrayList3);
        }
        final int n = arrayList.size() + arrayList2.size() + arrayList3.size();
        net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.info("Total conversion count is " + n);
        final llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(s);
        IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl;
        if (llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI() == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) {
            iiIllllllIllIIIlllIl = new IlIIIlIIIllllIlIlIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll, 0.5f);
        }
        else {
            iiIllllllIllIIIlllIl = new IIIllllllIllIIIlllIl(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI(), llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl());
        }
        this.llllIIIIlIIIlIlllIll(new File(file, "region"), arrayList, iiIllllllIllIIIlllIl, 0, n, lllllIIIIIlIlIIIIIIl);
        this.llllIIIIlIIIlIlllIll(new File(file2, "region"), arrayList2, new IlIIIlIIIllllIlIlIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIIIIlllIlllllIlII, 0.0f), arrayList.size(), n, lllllIIIIIlIlIIIIIIl);
        this.llllIIIIlIIIlIlllIll(new File(file3, "region"), arrayList3, new IlIIIlIIIllllIlIlIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIlIIlIIIIlllIlllII, 0.0f), arrayList.size() + arrayList2.size(), n, lllllIIIIIlIlIIIIIIl);
        llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(19133);
        if (llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI() == llIllIlIlIIIIIIIllII.lIIIIlIIIIIlllIllIII) {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl);
        }
        this.llllIIIlIlllIlIIIIIl(s);
        this.llllIIIIlIIIlIlllIll(s, false).llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        return true;
    }
    
    private void llllIIIlIlllIlIIIIIl(final String s) {
        final File file = new File(this.llllIIIIlIIIlIlllIll, s);
        if (!file.exists()) {
            net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.warn("Unable to create level.dat_mcr backup");
        }
        else {
            final File file2 = new File(file, "level.dat");
            if (!file2.exists()) {
                net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.warn("Unable to create level.dat_mcr backup");
            }
            else if (!file2.renameTo(new File(file, "level.dat_mcr"))) {
                net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.warn("Unable to create level.dat_mcr backup");
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final File file, final Iterable iterable, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, int n, final int n2, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        final Iterator<File> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(file, iterator.next(), iiIllllllIllIIIlllIl, n, n2, lllllIIIIIlIlIIIIIIl);
            ++n;
            lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll((int)Math.round(100.0 * n / n2));
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final File file, final File file2, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final int n, final int n2, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        try {
            final String name = file2.getName();
            final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(file2);
            final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(new File(file, String.valueOf(name.substring(0, name.length() - ".mcr".length())) + ".mca"));
            for (int i = 0; i < 32; ++i) {
                for (int j = 0; j < 32; ++j) {
                    if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(i, j) && !llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI(i, j)) {
                        final DataInputStream llllIIIIlIIIlIlllIll = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(i, j);
                        if (llllIIIIlIIIlIlllIll == null) {
                            net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.warn("Failed to fetch input stream");
                        }
                        else {
                            final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                            llllIIIIlIIIlIlllIll.close();
                            final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll3 = IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI("Level"));
                            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
                            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Level", iiiIlllIIIIIIlIIIlll2);
                            IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, iiiIlllIIIIIIlIIIlll2, iiIllllllIllIIIlllIl);
                            final DataOutputStream ilIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl(i, j);
                            net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, (DataOutput)ilIlIlIlIlllllllllIl);
                            ilIlIlIlIlllllllllIl.close();
                        }
                    }
                }
                final int n3 = (int)Math.round(100.0 * (n * 1024) / (n2 * 1024));
                final int n4 = (int)Math.round(100.0 * ((i + 1) * 32 + n * 1024) / (n2 * 1024));
                if (n4 > n3) {
                    lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(n4);
                }
            }
            llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll();
            llIIlIIIlIIIllIlIIIl2.llllIIIIlIIIlIlllIll();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final File file, final Collection collection) {
        final File[] listFiles = new File(file, "region").listFiles(new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this));
        if (listFiles != null) {
            Collections.addAll(collection, listFiles);
        }
    }
}
