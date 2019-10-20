package cn.cooper.support.activitylauncher.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Means the argument is optional when start activity.
 * <pre><code>
 * {@literal @}Optional int id;
 * </code></pre>
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
@Documented
@Inherited
public @interface Optional {
}
