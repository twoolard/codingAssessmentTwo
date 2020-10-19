package com.interview.coding.challenge.utils.properties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import static com.interview.coding.challenge.utils.LogUtil.info;
import static com.interview.coding.challenge.utils.properties.FrameworkConstants.TEST_PROPFILE_ARG;


public class TestProperties {
  private static Config conf;
  private static String PROP_FILE_ARG = TEST_PROPFILE_ARG;

  static void loadTestParameters(){
      if (conf == null){
          String propFile = (System.getProperty(PROP_FILE_ARG) == null) ? "local.properties" : System.getProperty((PROP_FILE_ARG));
          conf = ConfigFactory.load("local.test.properties").withFallback(ConfigFactory.load(propFile));
      }
  }

    public static String getProperty(String paramName) {
        loadTestParameters();
        String value = conf.getString(paramName);
        if (paramName != null && !paramName.toLowerCase().contains("pwd") && !paramName.toLowerCase().contains("password")) {
            info("Retrieved Property: key [" + paramName + "], value [" + value + "]");
        } else {
            info("Retrieved Property: key [" + paramName + "]");
        }

        return (String) conf.getAnyRef(paramName);
    }
}
