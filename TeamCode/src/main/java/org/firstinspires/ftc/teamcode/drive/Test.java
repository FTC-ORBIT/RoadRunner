package org.firstinspires.ftc.teamcode.drive;


import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.opMode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp (name = "Test")
public class Test extends OpMode {
    public static SampleMecanumDrive drive = new SampleMecanumDrive(opMode.hardwareMap);


    @Override
    public void init() {

    }

    @Override
    public void loop() {
    }

}
