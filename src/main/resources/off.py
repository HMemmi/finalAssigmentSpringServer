import RPi.GPIO as GPIO
GPIO.cleanup()
GPIO.setmode(GPIO.BCM)
GPIO.setup(17,GPIO.OUT)
try:
  GPIO.output(17,False)
except KeyboardInterrupt:
        print("Exiting")
finally:
        print("clean up")
        GPIO.cleanup()
