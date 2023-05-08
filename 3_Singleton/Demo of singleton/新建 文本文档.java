 
 2023/4/19
 
 public final Logger getLogger(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        } else if ("ROOT".equalsIgnoreCase(name)) {
            return this.root;
        } else {
            int i = 0;
            Logger logger = this.root;
            Logger childLogger = (Logger)this.loggerCache.get(name);
            if (childLogger != null) {
                return childLogger;
            } else {
                int h;
                do {
                    h = LoggerNameUtil.getSeparatorIndexOf(name, i);
                    String childName;
                    if (h == -1) {
                        childName = name;
                    } else {
                        childName = name.substring(0, h);
                    }

                    i = h + 1;
                    synchronized(logger) {
                        childLogger = logger.getChildByName(childName);
                        if (childLogger == null) {
                            childLogger = logger.createChildByName(childName);
                            this.loggerCache.put(childName, childLogger);
                            this.incSize();
                        }
                    }

                    logger = childLogger;
                } while(h != -1);

                return childLogger;
            }
        }
    }
