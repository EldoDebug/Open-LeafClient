package net.optifine.util;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.zip.*;
import java.util.*;
import java.io.*;

public class IIlIIIIIllIlIIIlIIll
{
    public static String[] llllIIIIlIIIlIlllIll(final String s, final String s2) {
        return llllIIIIlIIIlIlllIll(new String[] { s }, new String[] { s2 });
    }
    
    public static String[] llllIIIIlIIIlIlllIll(final String[] array, final String[] array2) {
        final LinkedHashSet set = new LinkedHashSet();
        final llllIIllllIlIlIIIIll[] lllllIIIIIlIlIIIIIIl = llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl();
        for (int i = 0; i < lllllIIIIIlIlIIIIIIl.length; ++i) {
            set.addAll(Arrays.asList(llllIIIIlIIIlIlllIll(lllllIIIIIlIlIIIIIIl[i], array, array2, null)));
        }
        return (String[])set.toArray(new String[set.size()]);
    }
    
    public static String[] llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final String s, final String s2, final String[] array) {
        return llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, new String[] { s }, new String[] { s2 }, array);
    }
    
    public static String[] llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final String[] array, final String[] array2) {
        return llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, array, array2, null);
    }
    
    public static String[] llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final String[] array, final String[] array2, final String[] array3) {
        if (llllIIllllIlIlIIIIll instanceof llIllIIIIIllIlIIIIlI) {
            return llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, array3);
        }
        if (!(llllIIllllIlIlIIIIll instanceof net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll)) {
            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown resource pack type: " + llllIIllllIlIlIIIIll);
            return new String[0];
        }
        final File llllIIIIlIIIlIlllIll = ((net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll)llllIIllllIlIlIIIIll).llllIIIIlIIIlIlllIll;
        if (llllIIIIlIIIlIlllIll == null) {
            return new String[0];
        }
        if (llllIIIIlIIIlIlllIll.isDirectory()) {
            return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, "", array, array2);
        }
        if (llllIIIIlIIIlIlllIll.isFile()) {
            return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, array, array2);
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown resource pack file: " + llllIIIIlIIIlIlllIll);
        return new String[0];
    }
    
    private static String[] llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final String[] array) {
        if (array == null) {
            return new String[0];
        }
        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < array.length; ++i) {
            final String s = array[i];
            if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll(s))) {
                list.add(s);
            }
        }
        return list.toArray(new String[list.size()]);
    }
    
    private static String[] llllIIIIlIIIlIlllIll(final File file, final String s, final String[] array, final String[] array2) {
        final ArrayList<String> list = new ArrayList<String>();
        final String s2 = "assets/minecraft/";
        final File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return new String[0];
        }
        for (int i = 0; i < listFiles.length; ++i) {
            final File file2 = listFiles[i];
            if (file2.isFile()) {
                final String string = String.valueOf(s) + file2.getName();
                if (string.startsWith(s2)) {
                    final String substring = string.substring(s2.length());
                    if (IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(substring, array) && IIIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(substring, array2)) {
                        list.add(substring);
                    }
                }
            }
            else if (file2.isDirectory()) {
                final String[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(file2, String.valueOf(s) + file2.getName() + "/", array, array2);
                for (int j = 0; j < llllIIIIlIIIlIlllIll.length; ++j) {
                    list.add(llllIIIIlIIIlIlllIll[j]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
    
    private static String[] llllIIIIlIIIlIlllIll(final File file, final String[] array, final String[] array2) {
        final ArrayList<String> list = new ArrayList<String>();
        final String s = "assets/minecraft/";
        try {
            final ZipFile zipFile = new ZipFile(file);
            final Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                final String name = ((ZipEntry)entries.nextElement()).getName();
                if (name.startsWith(s)) {
                    final String substring = name.substring(s.length());
                    if (!IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(substring, array) || !IIIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(substring, array2)) {
                        continue;
                    }
                    list.add(substring);
                }
            }
            zipFile.close();
            return list.toArray(new String[list.size()]);
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return new String[0];
        }
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final String s) {
        return s.equals(s.toLowerCase(Locale.ROOT));
    }
    
    public static Properties IlIlIlIlIlllllllllIl(final String s, final String s2) {
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
        try {
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
            if (llllIIIIlIIIlIlllIll == null) {
                return null;
            }
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
            llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.close();
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(s2 + ": Loading " + s);
            return llIIlllIIlllIIllIllI;
        }
        catch (FileNotFoundException ex) {
            return null;
        }
        catch (IOException ex2) {
            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(s2 + ": Error reading " + s);
            return null;
        }
    }
    
    public static Properties llllIIIIlIIIlIlllIll(final InputStream inputStream, final String s) {
        if (inputStream == null) {
            return null;
        }
        try {
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
            llIIlllIIlllIIllIllI.load(inputStream);
            inputStream.close();
            return llIIlllIIlllIIllIllI;
        }
        catch (FileNotFoundException ex) {
            return null;
        }
        catch (IOException ex2) {
            return null;
        }
    }
}
