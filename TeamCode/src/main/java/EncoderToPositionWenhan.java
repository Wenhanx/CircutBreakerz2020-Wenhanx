import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class EncoderToPositionWenhan extends LinearOpMode {
    //left motors
    DcMotor motor = null;
    DcMotor motor1 = null;
    //right motors
    DcMotor motor2 = null;
    DcMotor motor3 = null;

    @Override
    public void runOpMode() throws InterruptedException {
        motor = hardwareMap.dcMotor.get("motor");
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        motor1 = hardwareMap.dcMotor.get("motor1");
        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        motor2 = hardwareMap.dcMotor.get("motor2");
        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor3.setDirection(DcMotorSimple.Direction.REVERSE);

        motor3 = hardwareMap.dcMotor.get("motor3");
        motor3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor3.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor3.setDirection(DcMotorSimple.Direction.REVERSE);


        waitForStart();

        int targetPosition = 400;

        while (motor.getCurrentPosition() <= targetPosition) {
            motor.setPower(1);
            motor1.setPower(1);
            motor2.setPower(1);
            motor3.setPower(1);
        }

        motor.setPower(0);
        motor1.setPower(0);
        motor2.setPower(0);
        motor3.setPower(0);
    }
}