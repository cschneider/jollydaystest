# Build

mvn clean install

# Install

Download and start karaf 4.0.8

In karaf shell do:

    feature:install scr
    install -s mvn:org.threeten/threeten-extra/1.2
    install -s mvn:de.jollyday/jollyday/0.5.3-SNAPSHOT
    install -s mvn:net.lr/jollydaystest/0.0.1-SNAPSHOT

The jollydaystest bundle should start and print the german public holidays for 2017.
