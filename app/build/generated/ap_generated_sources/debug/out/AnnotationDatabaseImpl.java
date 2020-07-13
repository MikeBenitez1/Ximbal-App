
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import com.google.inject.AnnotationDatabase;
import roboguice.fragment.FragmentUtil;

public class AnnotationDatabaseImpl extends AnnotationDatabase {

    public void fillAnnotationClassesAndFieldsNames(HashMap<String, Map<String, Set<String>>> mapAnnotationToMapClassWithInjectionNameToFieldSet) {
    
        String annotationClassName = null;
        Map<String, Set<String>> mapClassWithInjectionNameToFieldSet = null;
        Set<String> fieldNameSet = null;


        annotationClassName = "com.google.inject.Inject";
        mapClassWithInjectionNameToFieldSet = mapAnnotationToMapClassWithInjectionNameToFieldSet.get(annotationClassName);
        if( mapClassWithInjectionNameToFieldSet == null ) {
            mapClassWithInjectionNameToFieldSet = new HashMap<String, Set<String>>();
            mapAnnotationToMapClassWithInjectionNameToFieldSet.put(annotationClassName, mapClassWithInjectionNameToFieldSet);
        }

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("powerManager");
        fieldNameSet.add("sensorManager");
        fieldNameSet.add("prefs");
        mapClassWithInjectionNameToFieldSet.put("com.miguel.ximbal.activity.SecondActivity", fieldNameSet);

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("prefs");
        mapClassWithInjectionNameToFieldSet.put("com.miguel.ximbal.activity.TroubleCodesActivity", fieldNameSet);

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("prefs");
        mapClassWithInjectionNameToFieldSet.put("com.miguel.ximbal.io.ObdGatewayService", fieldNameSet);

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("notificationManager");
        mapClassWithInjectionNameToFieldSet.put("com.miguel.ximbal.io.AbstractGatewayService", fieldNameSet);


        annotationClassName = "roboguice.inject.InjectView";
        mapClassWithInjectionNameToFieldSet = mapAnnotationToMapClassWithInjectionNameToFieldSet.get(annotationClassName);
        if( mapClassWithInjectionNameToFieldSet == null ) {
            mapClassWithInjectionNameToFieldSet = new HashMap<String, Set<String>>();
            mapAnnotationToMapClassWithInjectionNameToFieldSet.put(annotationClassName, mapClassWithInjectionNameToFieldSet);
        }

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("vv");
        fieldNameSet.add("btStatusTextView");
        fieldNameSet.add("compass");
        fieldNameSet.add("obdStatusTextView");
        fieldNameSet.add("gpsStatusTextView");
        fieldNameSet.add("tl");
        mapClassWithInjectionNameToFieldSet.put("com.miguel.ximbal.activity.SecondActivity", fieldNameSet);

    }
    
    public void fillAnnotationClassesAndMethods(HashMap<String, Map<String, Set<String>>> mapAnnotationToMapClassWithInjectionNameToMethodsSet) {
    }
    
    public void fillAnnotationClassesAndConstructors(HashMap<String, Map<String, Set<String>>> mapAnnotationToMapClassWithInjectionNameToConstructorsSet) {
    }
    
    public void fillClassesContainingInjectionPointSet(HashSet<String> classesContainingInjectionPointsSet) {
        classesContainingInjectionPointsSet.add("com.miguel.ximbal.activity.SecondActivity");
        classesContainingInjectionPointsSet.add("com.miguel.ximbal.activity.TroubleCodesActivity");
        classesContainingInjectionPointsSet.add("com.miguel.ximbal.io.ObdGatewayService");
        classesContainingInjectionPointsSet.add("com.miguel.ximbal.io.AbstractGatewayService");
    }
    

    public void fillBindableClasses(HashSet<String> injectedClasses) {
        injectedClasses.add("android.widget.LinearLayout");
        injectedClasses.add("android.hardware.SensorManager");
        injectedClasses.add("android.os.PowerManager");
        injectedClasses.add("android.widget.TextView");
        injectedClasses.add("android.content.SharedPreferences");
        injectedClasses.add("android.app.NotificationManager");
        injectedClasses.add("android.widget.TableLayout");

        if(FragmentUtil.hasNative) {
            injectedClasses.add("android.app.FragmentManager");
        }

        if(FragmentUtil.hasSupport) {
            injectedClasses.add("android.support.v4.app.FragmentManager");
        }
    }

}
