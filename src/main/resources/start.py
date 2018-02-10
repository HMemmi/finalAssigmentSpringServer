import RPi.GPIO as GPIO
GPIO.cleanup()
GPIO.setmode(GPIO.BCM)
GPIO.setup(17,GPIO.OUT)
print("using")
try:  
  status=True  
  while True:  
      GPIO.output(17,status)
      status=not status
except KeyboardInterrupt:
        print("Exiting")
finally:
        print("clean up")
        GPIO.cleanup()
