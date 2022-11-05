package com.hayriaral.notification.model.enums;

/**
 * Enumeration for dispatch types.
 *
 * @author hayriaral
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public enum DispatchType {

    /**
     * Transmission of data to single destination.
     */
    SINGLE,

    /**
     * Transmission of multiple data.
     */
    BULK,

    /**
     * Transmission of same data to several destinations.
     */
    MULTICAST
}
