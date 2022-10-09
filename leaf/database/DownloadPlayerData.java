package leaf.database;

import java.net.*;
import javax.imageio.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.util.*;
import java.awt.image.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.io.*;
import java.io.*;

public class DownloadPlayerData
{
    public Map rankData;
    public Map capeData;
    public Map wingData;
    public Map hatData;
    public Map data;
    public Map hashMap;
    public ArrayList serverData;
    
    public DownloadPlayerData() {
        this.rankData = new HashMap();
        this.capeData = new HashMap();
        this.wingData = new HashMap();
        this.hatData = new HashMap();
        this.data = new HashMap();
        this.hashMap = new HashMap();
        this.serverData = new ArrayList();
        this.rankData = this.downloadPlayerData(this.rankData, "mjw8waevj2ipnnw/rank.txt");
        this.capeData = this.downloadPlayerData(this.capeData, "tt6o7c1q0h2w9bx/cape.txt");
        this.wingData = this.downloadPlayerData(this.wingData, "gsajze1qwp38gt5/wing.txt");
        this.hatData = this.downloadPlayerData(this.hatData, "eglzg7zphqqv0lr/hat.txt");
        this.data = this.downloadData(this.data, "41e1yfej2b0hx77/data.txt");
        this.serverData = this.downloadServerData(this.serverData, "w55fq9992i34uyp/server.txt");
    }
    
    Map downloadPlayerData(final Map map, final String s) {
        final String string = "https://www.dropbox.com/s/" + s + "?raw=1";
        map.clear();
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(this.nazoMethod(new URL(string))));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                map.put(line.split(":")[0], line.split(":")[1]);
            }
            bufferedReader.close();
            return map;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    Map downloadData(final Map map, final String s) {
        final String string = "https://www.dropbox.com/s/" + s + "?raw=1";
        map.clear();
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(this.nazoMethod(new URL(string))));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.split(":")[1].contains(",")) {
                    final String[] split = line.split(":")[1].split(",");
                    final String string2 = "https://www.dropbox.com/s/" + split[0] + "?raw=1";
                    BufferedImage read = null;
                    try {
                        read = ImageIO.read(new URL(string2));
                    }
                    catch (IOException ex) {}
                    final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(line.split(":")[0], new IlIlIlIlIlllllllllIl(read));
                    map.put(line.split(":")[0], llllIIIIlIIIlIlllIll);
                    this.hashMap.put(llllIIIIlIIIlIlllIll, Arrays.asList(split[1], split[2], split[3], split[4], split[5], split[6], split[7], split[8], split[9], split[10], split[11], split[12], split[13], split[14], split[15]));
                }
                else {
                    final String string3 = "https://www.dropbox.com/s/" + line.split(":")[1] + "?raw=1";
                    BufferedImage read2 = null;
                    try {
                        read2 = ImageIO.read(new URL(string3));
                    }
                    catch (IOException ex2) {}
                    map.put(line.split(":")[0], Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(line.split(":")[0], new IlIlIlIlIlllllllllIl(read2)));
                }
            }
            bufferedReader.close();
            return map;
        }
        catch (Exception ex3) {
            return null;
        }
    }
    
    ArrayList downloadServerData(final ArrayList list, final String s) {
        final String string = "https://www.dropbox.com/s/" + s + "?raw=1";
        list.clear();
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(this.nazoMethod(new URL(string))));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals("none")) {
                    list.add(line);
                }
            }
            bufferedReader.close();
            return list;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    File nazoMethod(final URL url) {
        File temp = null;
        Throwable t = null;
        try {
            final InputStream openStream = url.openStream();
            try {
                temp = this.createTemp(openStream);
            }
            finally {
                if (openStream != null) {
                    openStream.close();
                }
            }
        }
        finally {
            if (t == null) {
                final Throwable t2;
                t = t2;
            }
            else {
                final Throwable t2;
                if (t != t2) {
                    t.addSuppressed(t2);
                }
            }
        }
        return temp;
    }
    
    File createTemp(final InputStream inputStream) {
        final File tempFile = File.createTempFile("config", ".tmp");
        tempFile.deleteOnExit();
        Throwable t = null;
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            try {
                IOUtils.copy(inputStream, (OutputStream)fileOutputStream);
            }
            finally {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }
        }
        finally {
            if (t == null) {
                final Throwable t2;
                t = t2;
            }
            else {
                final Throwable t2;
                if (t != t2) {
                    t.addSuppressed(t2);
                }
            }
        }
        return tempFile;
    }
}
