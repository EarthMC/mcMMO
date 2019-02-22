package com.gmail.nossr50.config;


import java.io.File;

/**
 * This class is used for config files that validate their entries
 */
public abstract class ConfigValidated extends Config implements UnsafeValueValidation {
    /**
     * @param parentFolderPath Path to the "parent" folder on disk
     * @param relativePath Path to the config relative to the "parent" folder, this should mirror internal structure of resource files
     * @param mergeNewKeys if true, the users config will add keys found in the internal file that are missing from the users file during load
     * @param copyDefaults if true, the users config file when it is first made will be a copy of an internal resource file of the same name and path
     */
    public ConfigValidated(String parentFolderPath, String relativePath, boolean mergeNewKeys, boolean copyDefaults, boolean removeOldKeys)
    {
        super(parentFolderPath, relativePath, mergeNewKeys, copyDefaults, removeOldKeys);
        validateEntries();
    }

    /**
     * @param parentFolderFile File for the "parent" folder on disk
     * @param relativePath Path to the config relative to the "parent" folder, this should mirror internal structure of resource files
     * @param mergeNewKeys if true, the users config will add keys found in the internal file that are missing from the users file during load
     * @param copyDefaults if true, the users config file when it is first made will be a copy of an internal resource file of the same name and path
     */
    public ConfigValidated(File parentFolderFile, String relativePath, boolean mergeNewKeys, boolean copyDefaults, boolean removeOldKeys)
    {
        super(parentFolderFile, relativePath, mergeNewKeys, copyDefaults, removeOldKeys);
        validateEntries();
    }
}
