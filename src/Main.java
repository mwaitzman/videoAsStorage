  public Bitstream decodeVideo(Video video) {
    //variables: frame, width, height, color, brightness
    Pixel p = null;
    Bitstream output = new Bitstream();
    for (int f = 0; f < video.frames(); f++) {
      for (int w = 0; l < video.horizontalResolution; w++) {
        for ( int h = 0; h < video.verticalResolution; h++) {
          for (int c = 0; c < 3; c++) {
            p = video.frame(f).pixelAt(w,h);
            for (int b = 0; b < 8; b++) {
              output.add(( p.color(c).asInt() >> b % 2 ) ? 0 : 1); // I think I wrote this line incorrectly but you hopefully get what I mean -- would changing it to (( p.color(c).asInt() >> b << 1 % 2 ) ? 0 : 1) work?? I'm really just trying to check the value of that one bit...
            }
          }
        }
      }
    }
    return output;
  }
