package com.adda.app.Util;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ImageUtil {

	
	public static byte[]compressImage(byte[] data)
	{
		Deflater d = new Deflater();
		d.setLevel(Deflater.BEST_COMPRESSION);
		d.setInput(data);
		d.finish();
		
		ByteArrayOutputStream outputstream = new ByteArrayOutputStream();
		byte[] tmp = new byte[4*1024];
		while(!d.finished()) 
		{
			int size = d.deflate(tmp);
			outputstream.write(tmp,0,size);
			try {
				outputstream.close();
			}
			catch(Exception e) 
			{
				e.printStackTrace();
				
			}
		}
	return outputstream.toByteArray();
	}
	
	public static byte[] decompressImage(byte[] data) {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] tmp = new byte[4*1024];
        try {
            while (!inflater.finished()) {
                int count = inflater.inflate(tmp);
                outputStream.write(tmp, 0, count);
            }
            outputStream.close();
        } catch (Exception ignored) 
        {
        }
        System.out.println();
        return outputStream.toByteArray();
    }

	public static byte[] compressPhoto(byte[] bytes) {
		// TODO Auto-generated method stub
		return null;
	}
}
