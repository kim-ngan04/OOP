package hust.soict.hedspi.aims.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;

public class MediaStore extends JPanel {
	public MediaStore(Media media, Cart cart) {
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel(""+media.getCost()+"$");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// Thêm tương tác cho nút Add to cart
		JButton addToCartButton = new JButton("Add to cart");
        addToCartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	cart.addMedia(media);
                JOptionPane.showMessageDialog(null, cart.addMedia(media););
            }
        });
        container.add(addToCartButton);
		
		// Thêm tương tác cho nút Play
        if (media instanceof Playable) {
            JButton playButton = new JButton("Play");
            playButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    JDialog dialog = new JDialog();
                    dialog.setTitle(media.getTitle());
                    dialog.setSize(400, 300);

                    String mediaInfo = "<html>"+ media.playGUI().replace("\n", "<br/>") + "</html>";
                    JLabel mediaLabel = new JLabel(mediaInfo);
                    mediaLabel.setVerticalAlignment(JLabel.CENTER); 
                    mediaLabel.setHorizontalAlignment(JLabel.CENTER);
                    JScrollPane scrollPane = new JScrollPane(mediaLabel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                    
                    dialog.add(scrollPane);
                    dialog.setVisible(true);
                }
            });
            container.add(playButton);
        }
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

}