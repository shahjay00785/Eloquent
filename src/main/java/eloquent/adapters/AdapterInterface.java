package eloquent.adapters;

import eloquent.exceptions.EloquentException;
import eloquent.models.File;

public interface AdapterInterface {

    /**
     * Read a file
     *
     * @param path File Path
     *
     * @return {@link File}
     *
     * @throws EloquentException Eloquent Exception
     */
    File read(String path) throws EloquentException;

    /**
     * Write a new file.
     *
     * @param path File Path
     * @param contents File contents
     *
     * @return {@link File}
     *
     * @throws EloquentException Eloquent Exception
     */
    File write(String path, String contents) throws EloquentException;

    /**
     * Update a file.
     *
     * @param path File Path
     * @param contents File contents
     *
     * @return {@link File}
     *
     * @throws EloquentException Eloquent Exception
     */
    File update(String path, String contents) throws EloquentException;

    /**
     * Create or Update a file.
     *
     * @param path File Path
     * @param contents File contents
     *
     * @return {@link File}
     *
     * @throws EloquentException Eloquent Exception
     */
    File put(String path, String contents) throws EloquentException;

    /**
     * Check if a File exists or not
     *
     * @param path File Path
     *
     * @return boolean
     *
     * @throws EloquentException Eloquent Exception
     */
    boolean has(String path) throws EloquentException;

    /**
     * Rename a file
     *
     * @param path File Path
     * @param newPath New path
     *
     * @return boolean
     *
     * @throws EloquentException Eloquent Exception
     */
    boolean rename(String path, String newPath) throws EloquentException;

    /**
     * Copy a file
     *
     * @param path File Path
     * @param newPath New path
     *
     * @return boolean
     *
     * @throws EloquentException Eloquent Exception
     */
    boolean copy(String path, String newPath) throws EloquentException;

    /**
     * Delete a file
     *
     * @param path File Path
     *
     * @return boolean
     *
     * @throws EloquentException Eloquent Exception
     */
    boolean delete(String path) throws EloquentException;

    /**
     * Delete a directory
     *
     * @param path File Path
     *
     * @return boolean
     *
     * @throws EloquentException Eloquent Exception
     */
    boolean deleteDir(String path) throws EloquentException;

    /**
     * Create a directory
     *
     * @param path File Path
     *
     * @return boolean
     *
     * @throws EloquentException Eloquent Exception
     */
    boolean createDir(String path) throws EloquentException;



}
