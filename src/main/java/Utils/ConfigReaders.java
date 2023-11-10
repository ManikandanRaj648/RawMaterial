package Utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.File;

public class ConfigReaders {
	public static Properties InitializeProperties() {
		Properties prop=new Properties();
		File fls=new File(System.getProperty("user.dir")+"\\Config\\config.properties");
		try {
			FileInputStream files=new FileInputStream(fls);
			prop.load(files);
		}catch(Throwable e){
			e.printStackTrace();
		}
		return prop;
	}
}
