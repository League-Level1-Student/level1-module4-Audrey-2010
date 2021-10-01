package _07_fortune_teller;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

    JFrame frame = new JFrame();

    int frameWidth = 310;
    int frameHeight = 163;
//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
    //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
    //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
    //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
    //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
    //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
    FortuneTeller() throws Exception {
   	 // 1. Choose an image for your fortune teller and put it in your default package
   	 fortuneTellerImage = ImageIO.read(getClass().getResource("katrina.jpeg"));
   	 // 2. Adjust the frameWidth and frameHeight variables to fit your image nicely (doesn’t need a new line of code)
     // 3. Complete the begin() method in the FortuneTellerRunner class
 	 // 4. add a mouse listener to the frame
   	 frame.addMouseListener(this);

    }
//310x163
//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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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
    //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

    @Override
    public void mousePressed(MouseEvent e) {
   	 int mouseX = e.getX();
   	 int mouseY = e.getY();
   	 // 5. Print the mouseX variable
System.out.print(mouseX);
   	 // 6. Add the mouseY variable to the previous line so that it prints out too (no new line)
System.out.print(mouseY);
   	 // 7. Adjust your secret location co-ordinates here:
   	 int secretLocationX = 0;
   	 int secretLocationY = 0;
   	 /** If the mouse co-ordinates and secret location are close, we'll let them ask a question. */
   	 if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
   		 // 8. Find a spooky sound and put it in your _07_fortune_teller package (freesound.org)
   		 // play("src/_07_fortune_teller/creepy-noise.wav");
   		 play("src/07_fortune_teller/trumpet.wav");
   		 // 9. Play the sound
         //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
   		 // 10. Insert your completed Magic 8 ball code here
     		 int number;
   		Random boo = new Random();
   		
   		number = new Random().nextInt(4);
   	
   	System.out.println(number);
   		
   	String question = JOptionPane.showInputDialog("what's your (yes or no) question?");

   	if(number ==0) {
   		JOptionPane.showMessageDialog(null, "yep");
   	}
   	if(number==1) {
   		JOptionPane.showMessageDialog(null, "no");
   	}
   	
   	if(number==2) {
   		JOptionPane.showMessageDialog(null, "idk ask google");
   	}
   
   	if(number==3) {
   		JOptionPane.showMessageDialog(null, "._(--)_/`");
   	}
   	 }

    }

    private boolean areClose(int mouseX, int secretLocationX) {
   	 return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
    }

    private void pause(int seconds) {
   	 try {
   		 Thread.sleep(1000 * seconds);
   	 } catch (InterruptedException e) {
   		 e.printStackTrace();
   	 }
    }
    
    /**************** don't worry about the stuff under here *******************/
    
    BufferedImage fortuneTellerImage;



    @Override
    public void run() {
   	 frame.add(this);
   	 setPreferredSize(new Dimension(frameWidth, frameHeight));
   	 frame.pack();
   	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 frame.setResizable(false);
   	 frame.setVisible(true);
    }
    
     public static synchronized void play(final String fileName)
    {
        // Note: use .wav files            
        new Thread(new Runnable() {
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(fileName));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.out.println("play sound error: " + e.getMessage() + " for " + fileName);
                }
            }
        }).start();
    }

private void showAnotherImage(String imageName) {
   	 try {
   		 fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
   	 } catch (Exception e) {
   		 System.err.println("Couldn't find this image: " + imageName);
   	 }
   	 repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
   	 g.drawImage(fortuneTellerImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}

// Copyright The League, 2016
















//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


//dog
