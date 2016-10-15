/**
 * Copyright (C) 2014-2016 Open Whisper Systems
 *
 * Licensed according to the LICENSE file in this repository.
 */

package org.whispersystems.signalservice.api.messages;

import org.whispersystems.libsignal.util.guava.Optional;

import java.io.InputStream;

/**
 * Represents a local SignalServiceAttachment to be sent.
 */
public class SignalServiceAttachmentStream extends SignalServiceAttachment {

  private final InputStream      inputStream;
  private final long             length;
  private final ProgressListener listener;
  private final Optional<byte[]> preview;

  public SignalServiceAttachmentStream(InputStream inputStream, String contentType, long length, ProgressListener listener) {
    this(inputStream, contentType, length, Optional.<byte[]>absent(), listener);
  }

  public SignalServiceAttachmentStream(InputStream inputStream, String contentType, long length, Optional<byte[]> preview, ProgressListener listener) {
    super(contentType);
    this.inputStream = inputStream;
    this.length      = length;
    this.listener    = listener;
    this.preview     = preview;
  }

  @Override
  public boolean isStream() {
    return true;
  }

  @Override
  public boolean isPointer() {
    return false;
  }

  public InputStream getInputStream() {
    return inputStream;
  }

  public long getLength() {
    return length;
  }

  public ProgressListener getListener() {
    return listener;
  }

  public Optional<byte[]> getPreview() {
    return preview;
  }
}
