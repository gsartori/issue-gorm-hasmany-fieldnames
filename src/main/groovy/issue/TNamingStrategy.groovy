package issue

import org.hibernate.cfg.ImprovedNamingStrategy

class TNamingStrategy extends ImprovedNamingStrategy {

    @Override
    String classToTableName(String className) {
        String newClassName =  className.startsWith('T')
                ? className.substring(1)
                : className

        return newClassName.toLowerCase()
    }
}