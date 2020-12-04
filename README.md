# videoAsStorage
 an attempt to use video as a binary storage container


 So I was thinking about using video as storage and I came up with this.
 Youtube allows up to 50 videos to be uploaded per day to an account, with each video having a maximum duration of 12 hours and a maximum file size of 128 gigabytes. Each video can be at 4K resolution with 60 FPS and has 24-bit color ( 256 = 8 bits, RGB = 3, 3*8 = 24).
 This program will allow files to be taken as a stream of bits and encoded as a video(s) and then uploaded to youtube.
 the beauty of it would be that you could take a zip file as a bitstream and encode that as a video(s) then upload it and at any later point in time, decode it just by looking at the video as displayed by youtube, without actually needing access to the source file - you could also use this for making files available online to others, since anyone who can view the video can losslessly convert it back to the original bitstream if they use the decoding program that implements the correct algorithm.

 Storage calculations:
 `24*3840*2160*60` = 11943936000
11943936000/1024/1024/1024 = 11.1236572266
= ~11.12 gigabits
= ~1.39 gigabytes encoded per second

You can encode 1.4 gigabytes into each second of the video.
