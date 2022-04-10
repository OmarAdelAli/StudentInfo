import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class MiniProject
{

  private JFrame f;

  private JPanel p1, p2, p3, p4, p5, p6;

  private JLabel l1, l2, l3, l4, l5, l6, l7;

  private TextField tx1, tx2, tx3, tx4;

  private CheckboxGroup cg;

  private JButton b1, b2, b3;

  private Checkbox cb1, cb2, cb3;

  private JComboBox c;

  private JTextArea ta1;

    MiniProject ()
  {

    f = new JFrame ();

    f.setVisible (true);

    f.setSize (500, 500);

    f.setTitle ("checkbox");

    f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    p1 = new JPanel (new GridLayout (2, 2));

    p2 = new JPanel (new GridLayout (5, 2));

    p3 = new JPanel (new GridLayout (6, 1));

    p4 = new JPanel ();

    p5 = new JPanel ();

    p6 = new JPanel (new GridLayout (1, 3));

    l1 = new JLabel (" ID no. : ");

    l2 = new JLabel (" First Name : ");

    l3 = new JLabel (" Last Name : ");

    l4 = new JLabel (" Age : ");

    l5 = new JLabel (" Gender : ");

    l6 = new JLabel (" Course : ");

    l7 = new JLabel (" Department : ");

    tx1 = new TextField (5);

    tx2 = new TextField (5);

    tx3 = new TextField (5);

    tx4 = new TextField (5);

    cg = new CheckboxGroup ();

    Checkbox c1 = new Checkbox ("Male", cg, true);

    Checkbox c2 = new Checkbox ("Female", cg, false);

      b1 = new JButton ("New");

      b2 = new JButton ("Save");

      b3 = new JButton ("Cancel");

      cb1 = new Checkbox ("OOP");

      cb2 = new Checkbox ("Date Structure");

      cb3 = new Checkbox ("Operating System");

      String[] items =
    {
    "CS", "IS", "IT", "CE"};

    c = new JComboBox (items);

    ta1 = new JTextArea (20, 85);

    b1.addActionListener (new ActionListener ()
			  {

			  public void actionPerformed (ActionEvent e)
			  {

			  tx1.getSelectedText ().toString ();
			  tx1.setText ("");
			  tx2.getSelectedText ().toString ();
			  tx2.setText ("");
			  tx3.getSelectedText ().toString ();
			  tx3.setText ("");
			  tx4.getSelectedText ().toString ();
			  tx4.setText ("");
			  cb1.setState (false);
			  cb2.setState (false);
			  cb3.setState (false);
			  c1.setState (true); c.setSelectedItem ("CS");
			  ta1.setText ("");
			  }
			  });

    b2.addActionListener (new ActionListener ()
			  {

			  public void actionPerformed (ActionEvent e)
			  {

			  String n = tx1.getText ().toString ();
			  String s = tx2.getText ().toString ();
			  String m = tx3.getText ().toString ();
			  String l = tx4.getText ().toString ();
			  ta1.append ("" + n + " " + s + " " + m + " " + l +
				      " ");
			  ta1.append (cg.getSelectedCheckbox ().getLabel ().
				      toString () + "\t");
			  if (cb1.getState ())
			  {

			  ta1.append (cb1.getLabel ().toString () + "\t");}

			  if (cb2.getState ())
			  {

			  ta1.append (cb2.getLabel ().toString () + "\t");}

			  if (cb3.getState ())
			  {

			  ta1.append (cb3.getLabel ().toString () + "\t");}

			  ta1.append (c.getSelectedItem ().toString ());}

			  }
    );

    b3.addActionListener (new ActionListener ()
			  {

			  public void actionPerformed (ActionEvent e)
			  {
			  System.exit (0);
			  }
			  });

    p2.add (l1);

    p2.add (tx1);

    p2.add (l2);

    p2.add (tx2);

    p2.add (l3);

    p2.add (tx3);

    p2.add (l4);

    p2.add (tx4);

    p2.add (p6);

    p6.add (l5);

    p6.add (c1);

    p6.add (c2);

    p4.add (b1);

    p4.add (b2);

    p4.add (b3);

    p3.add (l6);

    p3.add (cb1);

    p3.add (cb2);

    p3.add (cb3);

    p3.add (l7);

    p3.add (c);

    p1.add (p2);

    p1.add (p3);

    p1.add (p4);

    p1.add (p5);

    p5.add (ta1);

    f.add (p1);

    p6.add (l5, BorderLayout.WEST);

    p6.add (c1, BorderLayout.CENTER);

    p6.add (c2, BorderLayout.EAST);

  }
  public static void main (String[]args)
  {
    new MiniProject ();
  }
}
