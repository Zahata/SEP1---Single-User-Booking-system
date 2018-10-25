package SEP1;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SingleSelectionModel;
import javax.swing.border.TitledBorder;

public class BookingSystemGUI extends JFrame {

	private MyButtonListener listener;
	private JTabbedPane tabs;

	private JPanel home;
	private JPanel reservation;
	private JPanel tabCheckIn;

	private JPanel header;
	private JPanel guestInfo;
	private JPanel footer;
	private JPanel NamePanel;
	private JPanel addressPanel;
	private JPanel countryPanel;
	private JPanel birthdayPanel;
	private JPanel phonePanel;

	private JLabel headerLabel;
	private JLabel NameLabel;
	private JLabel addressLabel;
	private JLabel countryLabel;
	private JLabel birthdayLabel;
	private JLabel birthmonthLabel;
	private JLabel birthyearLabel;
	private JLabel phoneLabel;

	private JTextField NameField;
	private JTextField addressField;
	private JTextField countryField;
	private JTextField birthdayField;
	private JTextField birthmonthField;
	private JTextField birthyearField;
	private JTextField phoneField;

	private JButton saveButton;
	private JButton cancelButton;
	private JButton calculateButton;

	private JPanel priceInfoPanel;
	private JPanel subTotalPanel;
	private JPanel discountPanel;
	private JPanel totalPanel;


	private JPanel roomInfoPanel;
	private JPanel roomNrPanel;
	private JPanel dateInPanel;
	private JPanel dateOutPanel;
	private JPanel homeAvailButtons;

	private JLabel roomNrLabel;
	private JLabel dateInLabel;
	private JLabel dateOutLabel;
	private JLabel subTotalLabel;
	private JLabel discountLabel;
	private JLabel totalLabel;
	private JLabel homeAvailLabel;


	private JTextField roomNrField;
	private JTextField subTotalField;
	private JTextField discountField;
	private JTextField totalField;
	private JTextField homeAvailField;



	private JPanel homeHeaderPanel;
	private JPanel homeCheckPanel;
	private JPanel homeGuestListPanel;
	private JPanel homeAllAvailPanel;
	private JPanel homeAvailPanel;

	private JPanel homeCheckInPanel;
	private JPanel homeCheckOutPanel;
	private JPanel homeTypePanel;

	private JTextArea homeGuestListArea;
	private JScrollPane homeGuestListPane;
	private JTextField dateInDayField;
	private JTextField dateInMonthField;
	private JTextField dateInYearField;
	private JTextField dateOutDayField;
	private JTextField dateOutMonthField;
	private JTextField dateOutYearField;
	private JTextField checkInMonthField;
	private JTextField checkInDayField;
	private JTextField checkInYearField;
	private JTextField checkOutDayField;
	private JTextField checkOutMonthField;
	private JTextField checkOutYearField;

	private JLabel homeHeaderLabel;
	private JLabel homeCheckInLabel;
	private JLabel homeCheckOutLabel;
	private JLabel homeTypeLabel;
	private JLabel checkInMonthLabel;
	private JLabel dateInMonthLabel;
	private JLabel dateInYearLabel;
	private JLabel dateOutMonthLabel;
	private JLabel dateOutYearLabel;
	private JLabel checkInYearLabel;
	private JLabel checkOutMonthLabel;
	private JLabel checkOutYearLabel;

	private JComboBox<String> homeTypeBox;

	private JButton homeSearchButton;
	private JButton homeBookingListButton;
	private JButton homeGuestListButton;
	private JButton CheckInListButton;
	private JButton CheckOutListButton;
	private JButton roomSearchButton;
	private JButton deleteBookingButton;
	private JButton homeAvailButton;

	private JPanel CheckIntop;
	private JPanel CheckInmainPanel;
	private JPanel CheckIngeneralInfoPanel;
	private JPanel CheckIninputGuestPanel;


	private JPanel CheckIncomands;
	private JPanel CheckInguestNamePanel;
	private JPanel CheckInaddressPanel;
	private JPanel CheckIncountryPanel;
	private JPanel CheckInbirthdayPanel;
	private JPanel CheckInphonePanel;

	private JPanel roomInfoCheckIn;
	private JPanel CheckIndateInPanel;
    private JPanel CheckIngetInfoPanel;
    private JPanel roomInfoCheckInPanel;
    private JPanel roomNumberCheckInPanel;
    private JPanel typeCheckInPanel;
    private JPanel inputRoomInfoCheckInPanel;
    private JPanel priceCheckInPanel;
    private JPanel CheckInButtons;
    
    private JLabel inputRoomInfoCheckInLabel;
    private JLabel CheckInguestNameLabel;
	private JLabel CheckInaddressLabel;
	private JLabel CheckIncountryLabel;
	private JLabel CheckInbirthdayLabel;
	private JLabel CheckInphoneLabel;
	private JLabel CheckIntopLabel;
	private JLabel roomInfoCheckInLabel;
	private JLabel roomNumberICheckInLabel;
	private JLabel typeCheckInLabel;
	private JLabel priceCheckInLabel;

	private JLabel CheckIndateInLabel;
	private JLabel CheckIndateInMonthLabel;
	private JLabel CheckIndateInYearLabel;


	private JTextField CheckInguestName;
	private JTextField CheckInaddress;
	private JTextField CheckIncountry;

	private JTextField CheckInphone;

	private JTextField inputRoomNumberCheckInField;
	private JTextField inputPriceCheckInField;
	private JTextField CheckIndateInDayField;
	private JTextField CheckIndateInMonthField;
	private JTextField CheckIndateInYearField;

	private JButton CheckInsave;
	private JButton CheckIncancel;

	private JButton roomSearchCheckInButton;
	private JButton setCheckInButton;
	private JButton CheckIngetInfoButton;
	private JButton CheckInCheckOutButton;
	
	private JButton checkOutCheckOut;
	private JComboBox typeCheckInBox;
	



	public BookingSystemGUI() {
		super("Overlook Hotel");

		listener = new MyButtonListener();
		header = new JPanel();
		headerLabel = new JLabel("Reservation");
		header.setLayout(new FlowLayout());
		header.add(headerLabel);
		Font headerFont = new Font(headerLabel.getFont().getFamily(),
				Font.PLAIN, 20);
		headerLabel.setFont(headerFont);
		// header.add(headerLabel);

		guestInfo = new JPanel();
		guestInfo.setLayout(new BoxLayout(guestInfo, BoxLayout.Y_AXIS));
		guestInfo.setBorder(new TitledBorder("Guest Info"));
		addressPanel = new JPanel();
		addressLabel = new JLabel("Address:                 ");
		addressField = new JTextField(15);
		addressPanel.add(addressLabel);
		addressPanel.add(addressField);
		addressPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		countryPanel = new JPanel();
		countryLabel = new JLabel("Country:                  ");
		countryField = new JTextField(15);
		countryPanel.add(countryLabel);
		countryPanel.add(countryField);
		countryPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		birthdayPanel = new JPanel();
		birthdayLabel = new JLabel("Birthday:                 ");
		birthmonthLabel = new JLabel("/");
		birthyearLabel = new JLabel("/");
		birthdayField = new JTextField(4);
		birthmonthField = new JTextField(4);
		birthyearField = new JTextField(4);
		birthdayPanel.add(birthdayLabel);
		birthdayPanel.add(birthdayField);
		birthdayPanel.add(birthmonthLabel);
		birthdayPanel.add(birthmonthField);
		birthdayPanel.add(birthyearLabel);
		birthdayPanel.add(birthyearField);
		birthdayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		phonePanel = new JPanel();
		phoneLabel = new JLabel("Phone:                     ");
		phoneField = new JTextField(15);
		phonePanel.add(phoneLabel);
		phonePanel.add(phoneField);
		phonePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		guestInfo.add(addressPanel);
		guestInfo.add(phonePanel);
		guestInfo.add(countryPanel);
		guestInfo.add(birthdayPanel);

		roomInfoPanel = new JPanel();
		roomSearchButton = new JButton("Search");
		roomSearchButton.addActionListener(listener);
		roomInfoPanel.setLayout(new BoxLayout(roomInfoPanel, BoxLayout.Y_AXIS));
		roomInfoPanel.setBorder(new TitledBorder("Room Info"));
		roomNrPanel = new JPanel();
		roomNrLabel = new JLabel("Room Nr:     ");
		roomNrField = new JTextField(3);
		roomNrPanel.add(roomNrLabel);
		roomNrPanel.add(roomNrField);
		roomNrPanel.add(roomSearchButton);
		roomNrPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		NamePanel = new JPanel();
		NameLabel = new JLabel("Name:          ");
		NameField = new JTextField(15);
		NamePanel.add(NameLabel);
		NamePanel.add(NameField);
		NamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		dateInPanel = new JPanel();
		dateInLabel = new JLabel("Date In:        ");
		dateInMonthLabel = new JLabel("/");
		dateInYearLabel = new JLabel("/");
		dateInDayField = new JTextField(4);
		dateInMonthField = new JTextField(4);
		dateInYearField = new JTextField(4);
		dateInPanel.add(dateInLabel);
		dateInPanel.add(dateInDayField);
		dateInPanel.add(dateInMonthLabel);
		dateInPanel.add(dateInMonthField);
		dateInPanel.add(dateInYearLabel);
		dateInPanel.add(dateInYearField);
		dateInPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		dateOutPanel = new JPanel();
		dateOutLabel = new JLabel("Date Out:     ");
		dateOutMonthLabel = new JLabel("/");
		dateOutYearLabel = new JLabel("/");
		dateOutDayField = new JTextField(4);
		dateOutMonthField = new JTextField(4);
		dateOutYearField = new JTextField(4);
		dateOutPanel.add(dateOutLabel);
		dateOutPanel.add(dateOutDayField);
		dateOutPanel.add(dateOutMonthLabel);
		dateOutPanel.add(dateOutMonthField);
		dateOutPanel.add(dateOutYearLabel);
		dateOutPanel.add(dateOutYearField);
		dateOutPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		roomInfoPanel.add(NamePanel);
		roomInfoPanel.add(roomNrPanel);
		roomInfoPanel.add(dateInPanel);
		roomInfoPanel.add(dateOutPanel);

		priceInfoPanel = new JPanel();
		priceInfoPanel.setLayout(new BoxLayout(priceInfoPanel, BoxLayout.Y_AXIS));
		priceInfoPanel.setBorder(new TitledBorder("Price Info"));
		subTotalPanel = new JPanel();
		subTotalLabel = new JLabel("Subtotal:          ");
		subTotalField = new JTextField(10);
		subTotalPanel.add(subTotalLabel);
		subTotalPanel.add(subTotalField);
		subTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		discountPanel = new JPanel();
		discountLabel = new JLabel("Discount:         ");
		discountField = new JTextField(3);
		calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(listener);
		
		discountPanel.add(discountLabel);
		discountPanel.add(discountField);
		discountPanel.add(calculateButton);
		discountPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		totalPanel = new JPanel();
		totalLabel = new JLabel("Total Price:      ");
		totalField = new JTextField(10);
		totalPanel.add(totalLabel);
		totalPanel.add(totalField);
		totalPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		checkOutCheckOut = new JButton("Check Out");
		checkOutCheckOut.addActionListener(listener);

		priceInfoPanel.add(subTotalPanel);
		priceInfoPanel.add(discountPanel);
		priceInfoPanel.add(totalPanel);
		priceInfoPanel.add(checkOutCheckOut);

		footer = new JPanel();
		footer.setLayout(new FlowLayout(FlowLayout.RIGHT));
		saveButton = new JButton("Save");
		saveButton.addActionListener(listener);
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(listener);
		deleteBookingButton = new JButton("Delete");
		deleteBookingButton.addActionListener(listener);
		footer.add(saveButton);
		footer.add(deleteBookingButton);
		footer.add(cancelButton);

		reservation = new JPanel();
		reservation.setLayout(new BorderLayout());
		reservation.add(header, BorderLayout.NORTH);
		reservation.add(guestInfo, BorderLayout.CENTER);
		reservation.add(roomInfoPanel, BorderLayout.WEST);
		reservation.add(priceInfoPanel, BorderLayout.EAST);
		reservation.add(footer, BorderLayout.SOUTH);

		homeHeaderPanel = new JPanel();
		homeHeaderLabel = new JLabel("Overlook Hotel");
		homeHeaderPanel.setLayout(new FlowLayout());
		homeHeaderPanel.add(homeHeaderLabel);
		Font homeHeaderFont = new Font(homeHeaderLabel.getFont().getFamily(),
				Font.PLAIN, 20);
		homeHeaderLabel.setFont(homeHeaderFont);
		homeCheckPanel = new JPanel();
		homeCheckPanel.setLayout(new BoxLayout(homeCheckPanel, BoxLayout.Y_AXIS));
		homeCheckPanel.setBorder(new TitledBorder(""));

		homeTypePanel = new JPanel();
		homeTypeLabel = new JLabel("Room Type:    ");
		homeTypePanel.add(homeTypeLabel);
		String[] homerooms = { "Single", "Twin", "Single Suite",
				"Double Suite", "Triple Suite", "King-Size" };
		homeTypeBox = new JComboBox<String>(homerooms);
		homeTypePanel.add(homeTypeBox);
		homeTypePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		homeCheckInPanel = new JPanel();
		homeCheckInLabel = new JLabel("Check-In:         ");
		checkInMonthLabel = new JLabel("/");
		checkInYearLabel = new JLabel("/");
		checkInDayField = new JTextField(4);
		checkInMonthField = new JTextField(4);
		checkInYearField = new JTextField(4);
		homeCheckInPanel.add(homeCheckInLabel);
		homeCheckInPanel.add(checkInDayField);
		homeCheckInPanel.add(checkInMonthLabel);
		homeCheckInPanel.add(checkInMonthField);
		homeCheckInPanel.add(checkInYearLabel);
		homeCheckInPanel.add(checkInYearField);
		homeCheckInPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		homeCheckOutPanel = new JPanel();
		homeCheckOutLabel = new JLabel("Check-Out:     ");
		checkOutMonthLabel = new JLabel("/");
		checkOutYearLabel = new JLabel("/");
		checkOutDayField = new JTextField(4);
		checkOutMonthField = new JTextField(4);
		checkOutYearField = new JTextField(4);
		homeCheckOutPanel.add(homeCheckOutLabel);
		homeCheckOutPanel.add(checkOutDayField);
		homeCheckOutPanel.add(checkOutMonthLabel);
		homeCheckOutPanel.add(checkOutMonthField);
		homeCheckOutPanel.add(checkOutYearLabel);
		homeCheckOutPanel.add(checkOutYearField);
		homeCheckOutPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		homeSearchButton = new JButton("Search");
		homeSearchButton.addActionListener(listener);

		homeCheckPanel.add(homeCheckInPanel);
		homeCheckPanel.add(homeCheckOutPanel);
		homeCheckPanel.add(homeTypePanel);
		homeCheckPanel.add(homeSearchButton);

		homeGuestListPanel = new JPanel();
		homeGuestListPanel.setLayout(new BoxLayout(homeGuestListPanel,
				BoxLayout.Y_AXIS));
		homeGuestListPanel.setBorder(new TitledBorder(""));
		homeGuestListArea = new JTextArea();
		homeGuestListPane = new JScrollPane(homeGuestListArea);
		homeGuestListPanel.add(homeGuestListPane);

		homeAllAvailPanel = new JPanel();
		homeAllAvailPanel.setLayout(new BoxLayout(homeAllAvailPanel,
				BoxLayout.Y_AXIS));
		homeAllAvailPanel.setBorder(new TitledBorder("Availability"));
		homeBookingListButton = new JButton("    Booking List");
		homeBookingListButton.addActionListener(listener);
		homeGuestListButton = new JButton("      Guest List  ");
		homeGuestListButton.addActionListener(listener);
		homeAvailPanel = new JPanel();
		homeAvailPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		homeAvailLabel = new JLabel("Name");
		homeAvailField = new JTextField(15);
		homeAvailPanel.add(homeAvailLabel);
		homeAvailPanel.add(homeAvailField);
		CheckInListButton = new JButton("   Check In List");
		CheckInListButton.addActionListener(listener);
		CheckOutListButton = new JButton("Check Out List");
		CheckOutListButton.addActionListener(listener);
		homeAvailButton = new JButton("Search");
		homeAvailButton.addActionListener(listener);
		homeAvailButtons = new JPanel();
		homeAvailButtons.setLayout(new BoxLayout(homeAvailButtons, BoxLayout.Y_AXIS));
		//homeAvailButtons.add(homeAvailButton);
		homeAvailButtons.add(homeBookingListButton);
		homeAvailButtons.add(homeGuestListButton);
		homeAvailButtons.add(CheckInListButton);
		homeAvailButtons.add(CheckOutListButton);
		homeAllAvailPanel.add(homeAvailButtons);
		homeAllAvailPanel.add(homeAvailPanel);
		homeAllAvailPanel.add(homeAvailButton);
		
		
		

		home = new JPanel();
		home.setLayout(new BorderLayout());
		home.add(homeHeaderPanel, BorderLayout.NORTH);
		home.add(homeCheckPanel, BorderLayout.WEST);
		home.add(homeGuestListPanel, BorderLayout.CENTER);
		home.add(homeAllAvailPanel, BorderLayout.EAST);

		tabCheckIn = new JPanel();

		CheckIntop = new JPanel();
		CheckIntopLabel = new JLabel("Check In");
		CheckIntop.setLayout(new FlowLayout());
		CheckIntop.add(CheckIntopLabel);
		Font topFont = new Font(CheckIntopLabel.getFont().getFamily(),
				Font.PLAIN, 20);
		CheckIntopLabel.setFont(topFont);

		CheckInmainPanel = new JPanel();
		CheckInmainPanel.setLayout(new BorderLayout());

		CheckIngeneralInfoPanel = new JPanel();
		CheckIngeneralInfoPanel.setLayout(new BoxLayout(
				CheckIngeneralInfoPanel, BoxLayout.Y_AXIS));
		CheckIngeneralInfoPanel
				.setBorder(new TitledBorder("Guest Information"));
		CheckInguestNamePanel = new JPanel();
		CheckInguestNamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		CheckInguestNameLabel = new JLabel("Guest Name:     ");

		CheckInaddressPanel = new JPanel();
		CheckInaddressPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		CheckInaddressLabel = new JLabel("Address:            ");

		CheckIncountryPanel = new JPanel();
		CheckIncountryPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		CheckIncountryLabel = new JLabel("Country:             ");

		CheckInbirthdayPanel = new JPanel();
		CheckInbirthdayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		CheckInbirthdayLabel = new JLabel("Birthday:            ");

		CheckInphonePanel = new JPanel();
		CheckInphonePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		CheckInphoneLabel = new JLabel("Phone:               ");

		CheckIninputGuestPanel = new JPanel();

		CheckInguestName = new JTextField(20);
		CheckInaddress = new JTextField(20);
		CheckIncountry = new JTextField(20);
		CheckIndateInPanel = new JPanel();
		CheckIndateInPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		CheckIndateInLabel = new JLabel("Birth:                   ");
		CheckIndateInMonthLabel = new JLabel("/");
		CheckIndateInYearLabel = new JLabel("/");
		CheckIndateInDayField = new JTextField(4);
		CheckIndateInMonthField = new JTextField(4);
		CheckIndateInYearField = new JTextField(4);
		
		CheckInphone = new JTextField(20);
		
		CheckInbirthdayPanel= new JPanel();
		CheckInbirthdayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		CheckIndateInLabel = new JLabel("Birthday:            ");
		CheckIndateInMonthLabel = new JLabel("/");
		CheckIndateInYearLabel = new JLabel("/");
		CheckIndateInDayField = new JTextField(4);
		CheckIndateInMonthField = new JTextField(4);
		CheckIndateInYearField = new JTextField(4);
		
		CheckInbirthdayPanel.add(CheckIndateInLabel);
		CheckInbirthdayPanel.add(CheckIndateInDayField);
		CheckInbirthdayPanel.add(CheckIndateInMonthLabel);
		CheckInbirthdayPanel.add(CheckIndateInMonthField);
		CheckInbirthdayPanel.add(CheckIndateInYearLabel);
		CheckInbirthdayPanel.add(CheckIndateInYearField);


		CheckInguestNamePanel.add(CheckInguestNameLabel);
		CheckInguestNamePanel.add(CheckInguestName);

		CheckInaddressPanel.add(CheckInaddressLabel);
		CheckInaddressPanel.add(CheckInaddress);

		CheckIncountryPanel.add(CheckIncountryLabel);
		CheckIncountryPanel.add(CheckIncountry);

		CheckInphonePanel.add(CheckInphoneLabel);
		CheckInphonePanel.add(CheckInphone);

		CheckIngeneralInfoPanel.add(CheckInguestNamePanel);
		CheckIngeneralInfoPanel.add(CheckInaddressPanel);
		CheckIngeneralInfoPanel.add(CheckIncountryPanel);
		CheckIngeneralInfoPanel.add(CheckInbirthdayPanel);
		CheckIngeneralInfoPanel.add(CheckInphonePanel);

		//roomInfoCheckIn
		roomInfoCheckIn  = new JPanel();
		
		roomInfoCheckIn.setLayout(new BoxLayout(roomInfoCheckIn,BoxLayout.Y_AXIS));
		roomInfoCheckIn.setBorder(new TitledBorder("Room Information"));
		roomNumberCheckInPanel = new JPanel();
		roomNumberCheckInPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		inputRoomInfoCheckInLabel = new JLabel("Room number:     ");
		inputRoomNumberCheckInField = new JTextField(3);
		roomNumberCheckInPanel.add(inputRoomInfoCheckInLabel);
		roomNumberCheckInPanel.add(inputRoomNumberCheckInField );
		
		typeCheckInPanel = new JPanel();
		typeCheckInPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    typeCheckInLabel = new JLabel("Type:                     ");
		String[] rooms = { "Single", "Twin", "Single Suite", "Double Suite",
					"Triple Suite", "King-Size" };
	    typeCheckInBox = new JComboBox<>(rooms);
	    typeCheckInPanel.add(typeCheckInLabel);
	    typeCheckInPanel.add(typeCheckInBox);
	    
	    priceCheckInPanel =new JPanel();
	    priceCheckInPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    priceCheckInLabel = new JLabel("Price:                     ");
	    inputPriceCheckInField = new JTextField(7);
	    priceCheckInPanel.add(priceCheckInLabel);
	    priceCheckInPanel.add(inputPriceCheckInField);
		
	    CheckInButtons = new JPanel();
		CheckInButtons.setLayout(new FlowLayout(FlowLayout.LEFT));
		roomSearchCheckInButton = new JButton("Search");
		roomSearchCheckInButton.addActionListener(listener);
		setCheckInButton = new JButton("Set");
		setCheckInButton.addActionListener(listener);
		CheckInButtons.add(setCheckInButton);
		CheckInButtons.add(roomSearchCheckInButton);
	    
		roomInfoCheckIn.add(roomNumberCheckInPanel);
		roomInfoCheckIn.add(typeCheckInPanel);
		roomInfoCheckIn.add(priceCheckInPanel);
		roomInfoCheckIn.add(CheckInButtons);
		
		
		
		CheckIncomands = new JPanel();
		CheckIncomands.setLayout(new FlowLayout(FlowLayout.RIGHT));
		CheckInsave = new JButton("Check In");
		CheckInsave.addActionListener(listener);
		CheckInCheckOutButton = new JButton("Check Out");
		CheckInCheckOutButton.addActionListener(listener);
		CheckIncomands.add(CheckInsave);
		CheckIncomands.add(CheckInCheckOutButton);
		CheckIncancel = new JButton("Cancel");
		CheckIncancel.addActionListener(listener);
		CheckIncomands.add(CheckIncancel);
		
		CheckIngetInfoButton = new JButton("Get Info");
		CheckIngetInfoButton.addActionListener(listener);
		
		CheckIngetInfoPanel = new JPanel();
		CheckIngetInfoButton.addActionListener(listener);
		CheckIngetInfoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		CheckIngetInfoPanel.add(CheckIngetInfoButton);
		

		tabCheckIn.setLayout(new BorderLayout());
		tabCheckIn.add(CheckIntop, BorderLayout.NORTH);
		tabCheckIn.add(CheckIngetInfoPanel, BorderLayout.CENTER);
		tabCheckIn.add(CheckIngeneralInfoPanel, BorderLayout.WEST);
		tabCheckIn.add(roomInfoCheckIn,BorderLayout.EAST);
		tabCheckIn.add(CheckIncomands, BorderLayout.SOUTH);
        

		tabs = new JTabbedPane();
		tabs.addTab("Home", home);
		tabs.addTab("Reservation", reservation);
		tabs.addTab("Check In", tabCheckIn);

		add(tabs);
		setSize(840, 400);
		setVisible(true);
		setResizable(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);


	}


	private class MyButtonListener implements ActionListener
	{
		/**
		 * A class, which adds actions to the buttons.
		 */
		RoomFileAdapter roomAdapter=new RoomFileAdapter("rooms.bin");
		GuestFileAdapter guestAdapter=new GuestFileAdapter("guests.bin");
		BookingFileAdapter bookAdapter= new BookingFileAdapter("bookings.bin");
		
		public void actionPerformed(ActionEvent e) 
		{
			/**
			 * An action, which happens when the "Save" button in "Reservation" tab is pressed.
			 * Takes the information from the fields to create and save a booking.
			 */
			if(e.getSource()==saveButton)
			{
				int number=-5;
				MyDate datein=new MyDate(0,0,0);
				MyDate dateout=new MyDate(0,0,0);
				MyDate bday=new MyDate(0,0,0);
				Booking book=new Booking(datein, dateout, null, null);
				try
				{
				number=Integer.parseInt(roomNrField.getText());
				datein=new MyDate(Integer.parseInt(dateInDayField.getText()),Integer.parseInt(dateInMonthField.getText()),Integer.parseInt(dateInYearField.getText()));
				dateout=new MyDate(Integer.parseInt(dateOutDayField.getText()),Integer.parseInt(dateOutMonthField.getText()),Integer.parseInt(dateOutYearField.getText()));
				bday= new MyDate(Integer.parseInt(birthdayField.getText()),Integer.parseInt(birthmonthField.getText()),Integer.parseInt(birthyearField.getText()));
				Guest guest= new Guest(NameField.getText(), addressField.getText(), countryField.getText(), phoneField.getText(),bday);
				book=new Booking(datein,dateout,guest,roomAdapter.getRoom(number));
				boolean free=true;
				try
				{
					free=bookAdapter.getAllBookings().isAvailable(datein, dateout, number);
				}
				catch(NullPointerException ee)
				{}
				if(!(datein.isBefore(dateout)&&datein.existingDate()&&dateout.existingDate()&&bday.existingDate()))
					JOptionPane.showMessageDialog(null, "Error, check dates!");
				
				else if(!free)
					JOptionPane.showMessageDialog(null, "Room is booked");
				else
				{
					int choice = JOptionPane.showConfirmDialog(null, "Save?");
							if(choice==JOptionPane.YES_OPTION)
							{
								bookAdapter.saveBooking(book);
							}
							else if(
							choice==JOptionPane.NO_OPTION)
								;
				}
				}
				catch(NumberFormatException ee)
				{
					JOptionPane.showMessageDialog(null, "Wrong format");
				}
				catch(ArrayIndexOutOfBoundsException ee)
				{
					JOptionPane.showMessageDialog(null, "No such room");
				}
				
			}
			/**
			 * An action, which happens when the "Cancel" button in "Reservation" tab is pressed.
			 * Removes the information from the fields.
			 */
			if(e.getSource()==cancelButton)
			{
				int choice = JOptionPane.showConfirmDialog(null, 
						"Do you want to delete all information?");
						if(choice==JOptionPane.YES_OPTION)
						{
						roomNrField.setText("");
						NameField.setText("");
						addressField.setText("");
						phoneField.setText("");
						countryField.setText("");
						discountField.setText("");
						dateInDayField.setText("");
						dateInMonthField.setText("");
						dateInYearField.setText("");
						dateOutDayField.setText("");
						dateOutMonthField.setText("");
						dateOutYearField.setText("");
						birthdayField.setText("");
						birthmonthField.setText("");
						birthyearField.setText("");
						subTotalField.setText("");
						discountField.setText("");
						totalField.setText("");
						}
						else if(choice==JOptionPane.NO_OPTION)
						;
				
				
			}
			/**
			 * An action, which happens when the "Calculate" button in "Reservation" tab is pressed.
			 * Takes the information from the fields to calculate the final price.
			 */
			if(e.getSource()==calculateButton)
			{
				double disc=0;
				try
				{
					disc=Double.parseDouble(discountField.getText());
				}
				catch(NumberFormatException ee)
				{
					
				}
				try
				{
					DecimalFormat df = new DecimalFormat("#.##");
					int number=Integer.parseInt(roomNrField.getText());
					MyDate datein=new MyDate(Integer.parseInt(dateInDayField.getText()),Integer.parseInt(dateInMonthField.getText()),Integer.parseInt(dateInYearField.getText()));
					MyDate dateout=new MyDate(Integer.parseInt(dateOutDayField.getText()),Integer.parseInt(dateOutMonthField.getText()),Integer.parseInt(dateOutYearField.getText()));
					if(!(datein.isBefore(dateout)&&datein.existingDate()&&dateout.existingDate()))
					{
						JOptionPane.showMessageDialog(null, "Check dates!");
					}
					else
					{
						double m=(datein.DaysTo(dateout))*(roomAdapter.getRoom(number).getPrice());
						subTotalField.setText(""+m);
						if(discountField.equals(""))
						{
							totalField.setText(""+m);
						}
						else
						{
							totalField.setText(""+df.format(m*(1-(disc/100))));
						}
					}
				}
				catch(NumberFormatException ee)
				{
					JOptionPane.showMessageDialog(null, "Please check fields!");
				}
				catch(ArrayIndexOutOfBoundsException ee)
				{
					JOptionPane.showMessageDialog(null, "Please check fields!");
				}
			}
			/**
			 * An action, which happens when the "Search" button on the left side in "Home" tab is pressed.
			 * Takes the information from the fields to print out all the available rooms, of the selected type, for the given time period.
			 */
			if(e.getSource()==homeSearchButton)
			{
				MyDate date1=new MyDate(0,0,0);
				MyDate date2=new MyDate(0,0,0);
				try
				{
					date1=new MyDate(Integer.parseInt(checkInDayField.getText()),Integer.parseInt(checkInMonthField.getText()),Integer.parseInt(checkInYearField.getText()));
					date2=new MyDate(Integer.parseInt(checkOutDayField.getText()),Integer.parseInt(checkOutMonthField.getText()),Integer.parseInt(checkOutYearField.getText()));
					if(!(date1.isBefore(date2)&&date1.existingDate()&&date2.existingDate()))
						JOptionPane.showMessageDialog(null, "Check dates!");
					else
					{
						homeGuestListArea.setText(bookAdapter.getAllBookings().getAllAvailable(date1, date2, (String)homeTypeBox.getSelectedItem()));
					}
				}
				catch(NumberFormatException ee)
				{
					JOptionPane.showMessageDialog(null, "Please check fields!");
				}
				
			}
			/**
			 * An action, which happens when the "Booking List" button in "Home" tab is pressed.
			 * Prints out all bookings.
			 */
			if(e.getSource()==homeBookingListButton)
			{
				BookingList list= bookAdapter.getAllBookings();
				
				if(list==null)
				{
					list = new BookingList();
				}
				
				homeGuestListArea.setText(list.toString());
			}
			/**
			 * An action, which happens when the "Guest List" button in "Home" tab is pressed.
			 * Prints out all guests.
			 */
			if(e.getSource()==homeGuestListButton)
			{
				try
				{
				GuestList g=guestAdapter.getAllGuests();
				homeGuestListArea.setText(g.toString());
				}
				catch(NullPointerException ee)
				{}
				
			}
			/**
			 * An action, which happens when the "Search" button in "Reservation" tab is pressed.
			 * Fills the fields with the information of a booking by the given name for the given room.
			 */
			if(e.getSource()==roomSearchButton)
			{
				
				int num=0;
				try
				{
					String name=NameField.getText();
					num=Integer.parseInt(roomNrField.getText());
					if(num<101&&num>121||num<201&&num>221)
						JOptionPane.showMessageDialog(null, "No such room");
					BookingList books=bookAdapter.getAllBookings();
					Booking book=new Booking(null,null,null,null);
					for (int i = 0; i < books.getSize(); i++) 
					{
						if(books.getBookingByIndex(i).getRoom().getRoomNumber()==num&&name.equals(books.getBookingByIndex(i).getGuest().getName()))
							book=books.getBookingByIndex(i);
						
					}
					dateInDayField.setText(""+book.getCheckIn().getDay());
					dateInMonthField.setText(""+book.getCheckIn().getMonth());
					dateInYearField.setText(""+book.getCheckIn().getYear());
					dateOutDayField.setText(""+book.getCheckOut().getDay());
					dateOutMonthField.setText(""+book.getCheckOut().getMonth());
					dateOutYearField.setText(""+book.getCheckOut().getYear());
					NameField.setText(book.getGuest().getName());
					addressField.setText(book.getGuest().getAddress());
					phoneField.setText(book.getGuest().getPhone());
					countryField.setText(book.getGuest().getNationality());
					birthdayField.setText(""+book.getGuest().getBirthday().getDay());
					birthmonthField.setText(""+book.getGuest().getBirthday().getMonth());
					birthyearField.setText(""+book.getGuest().getBirthday().getYear());
				}
				catch(NumberFormatException ee)
				{
					JOptionPane.showMessageDialog(null, "No such room");
				}
				catch(NullPointerException ee)
				{
					JOptionPane.showMessageDialog(null, "No bookings");
				}
			}
			/**
			 * An action, which happens when the "Delete" button in "Reservation" tab is pressed.
			 * Deletes the reservation with the given information.
			 */
			if(e.getSource()==deleteBookingButton)
			{
				
					int number=-5;
					MyDate datein=new MyDate(0,0,0);
					MyDate dateout=new MyDate(0,0,0);
					MyDate bday=new MyDate(0,0,0);
					Booking book=new Booking(datein, dateout, null, null);
					try
					{
					number=Integer.parseInt(roomNrField.getText());
					datein=new MyDate(Integer.parseInt(dateInDayField.getText()),Integer.parseInt(dateInMonthField.getText()),Integer.parseInt(dateInYearField.getText()));
					dateout=new MyDate(Integer.parseInt(dateOutDayField.getText()),Integer.parseInt(dateOutMonthField.getText()),Integer.parseInt(dateOutYearField.getText()));
					bday= new MyDate(Integer.parseInt(birthdayField.getText()),Integer.parseInt(birthmonthField.getText()),Integer.parseInt(birthyearField.getText()));
					Guest guest= new Guest(NameField.getText(), addressField.getText(), countryField.getText(), phoneField.getText(),bday);
					book=new Booking(datein,dateout,guest,roomAdapter.getRoom(number));
					
						int choice = JOptionPane.showConfirmDialog(null, "Delete booking?");
								if(choice==JOptionPane.YES_OPTION)
								{
									bookAdapter.removeBooking(book);
								}
								else if(
								choice==JOptionPane.NO_OPTION)
									;
					}
					catch(NumberFormatException ee)
					{
						JOptionPane.showMessageDialog(null, "Wrong format");
					}
					catch(ArrayIndexOutOfBoundsException ee)
					{
						JOptionPane.showMessageDialog(null, "No such room");
					}
				}
			if(e.getSource()==homeAvailButton)
			{
				try
				{
				homeGuestListArea.setText(bookAdapter.getAllBookings().getBookingByName(homeAvailField.getText()).toString());
				}
				catch(NullPointerException ee)
				{}
			}
			/**
			 * An action, which happens when the "Check Out" button in "Reservation" tab is pressed.
			 * Checks-out the guest, deletes the booking with the given information and shows the final price.
			 */
			if(e.getSource()==checkOutCheckOut)
			{
				int number=-5;
				MyDate datein=new MyDate(0,0,0);
				MyDate dateout=new MyDate(0,0,0);
				MyDate bday=new MyDate(0,0,0);
				Booking book=new Booking(datein, dateout, null, null);
				try
				{
				number=Integer.parseInt(roomNrField.getText());
				datein=new MyDate(Integer.parseInt(dateInDayField.getText()),Integer.parseInt(dateInMonthField.getText()),Integer.parseInt(dateInYearField.getText()));
				dateout=new MyDate(Integer.parseInt(dateOutDayField.getText()),Integer.parseInt(dateOutMonthField.getText()),Integer.parseInt(dateOutYearField.getText()));
				bday= new MyDate(Integer.parseInt(birthdayField.getText()),Integer.parseInt(birthmonthField.getText()),Integer.parseInt(birthyearField.getText()));
				Guest guest= new Guest(NameField.getText(), addressField.getText(), countryField.getText(), phoneField.getText(),bday);
				book=new Booking(datein,dateout,guest,roomAdapter.getRoom(number));
				bookAdapter.removeBooking(book);
				guestAdapter.removeGuest(guest);
				double sum=Double.parseDouble(totalField.getText());
				JOptionPane.showMessageDialog(null,"Total price: "+sum);
				}
				catch(NumberFormatException ee)
				{
					JOptionPane.showMessageDialog(null, "Wrong format");
				}
				catch(ArrayIndexOutOfBoundsException ee)
				{
					JOptionPane.showMessageDialog(null, "No such room");
				}
			}
			/**
			 * An action, which happens when the "Cancel" button in "Check In" tab is pressed.
			 * Clears all guest information fields.
			 */
			if(e.getSource()==CheckIncancel)
			{
				int choice = JOptionPane.showConfirmDialog(null, 
						"Do you want to delete all information?");
						if(choice==JOptionPane.YES_OPTION)
						{
						CheckInguestName.setText("");
						CheckInaddress.setText("");
						CheckIncountry.setText("");
						CheckInphone.setText("");
						CheckIndateInDayField.setText("");
						CheckIndateInMonthField.setText("");
						CheckIndateInYearField.setText("");
						}
						else if(choice==JOptionPane.NO_OPTION)
						;
				
			}
			/**
			 * An action, which happens when the "Check In" button in "Check In" tab is pressed.
			 * Checks-in a guest with the given information.
			 */
			if(e.getSource()==CheckInsave)
			{
				try
				{
				guestAdapter.saveGuest(new Guest(CheckInguestName.getText(),CheckInaddress.getText(),CheckIncountry.getText(),CheckInphone.getText(),new MyDate(Integer.parseInt(CheckIndateInDayField.getText()),Integer.parseInt(CheckIndateInMonthField.getText()),Integer.parseInt(CheckIndateInYearField.getText()))));
				JOptionPane.showMessageDialog(null, "Checked in!");
				}
				catch(NumberFormatException ee)
				{
					JOptionPane.showMessageDialog(null, "Wrong format");
				}
			}
			/**
			 * An action, which happens when the "Check Out" button in "Check In" tab is pressed.
			 * Checks-out a guest with the given information.
			 */
			if(e.getSource()==CheckInCheckOutButton)
			{
				try
				{
				guestAdapter.removeGuest(guestAdapter.getAllGuests().getGuestByName(CheckInguestName.getText()));
				JOptionPane.showMessageDialog(null, "Checked out!");
				}
				catch(NumberFormatException ee)
				{
					JOptionPane.showMessageDialog(null, "Wrong format");
				}
				catch(NullPointerException ee)
				{
					JOptionPane.showMessageDialog(null, "No guests");
				}
			}
			/**
			 * An action, which happens when the "Get Info" button in "Check In" tab is pressed.
			 * Fills the fields with the information of the guest with the given name.
			 */
			if(e.getSource()==CheckIngetInfoButton)
			{
				try
				{
				Guest g=guestAdapter.getAllGuests().getGuestByName(CheckInguestName.getText());
				CheckInaddress.setText(g.getAddress());
				CheckInaddress.setText(g.getAddress());
				CheckInphone.setText(g.getPhone());
				CheckIncountry.setText(g.getNationality());
				CheckIndateInDayField.setText(""+g.getBirthday().getDay());
				CheckIndateInMonthField.setText(""+g.getBirthday().getMonth());
				CheckIndateInYearField.setText(""+g.getBirthday().getYear());
				}
				catch(NullPointerException ee)
				{
					JOptionPane.showMessageDialog(null, "No guests");
				}
			}
			/**
			 * An action, which happens when the "Set" button in "Check In" tab is pressed.
			 * Sets the type and the price of the room with the selected number.
			 */
			if(e.getSource()==setCheckInButton)
			{
				try
				{
					Object room1=null;
					double price=Double.parseDouble(inputPriceCheckInField.getText());
					int number=Integer.parseInt(inputRoomNumberCheckInField.getText());
					if(typeCheckInBox.getSelectedItem().equals("Single"))
					{
						SingleRoom room=new SingleRoom(number);
						room.setPrice(price);
						room1=room;
					}
					else if(typeCheckInBox.getSelectedItem().equals("Twin"))
					{
						TwinBedroom room=new TwinBedroom(number);
						room.setPrice(price);
						room1=room;
					}
					else if(typeCheckInBox.getSelectedItem().equals("Single Suite"))
					{
						SingleBedroomSuite room=new SingleBedroomSuite(number);
						room.setPrice(price);
						room1=room;
					}
					else if(typeCheckInBox.getSelectedItem().equals("Double Suite"))
					{
						DoubleBedroomSuite room=new DoubleBedroomSuite(number);
						room.setPrice(price);
						room1=room;
					}
					else if(typeCheckInBox.getSelectedItem().equals("Triple Suite"))
					{
						ThreeBedroomSuite room=new ThreeBedroomSuite(number);
						room.setPrice(price);
						room1=room;
					}
					else
					{
						KingSizeBedroom room=new KingSizeBedroom(number);
						room.setPrice(price);
						room1=room;
					}
					int choice = JOptionPane.showConfirmDialog(null, 
							"Change room?");
							if(choice==JOptionPane.YES_OPTION)
							{
								roomAdapter.changeRoom((Room)room1);
							}
							else if(choice==JOptionPane.NO_OPTION)
							;
					
					
				}
				catch(NumberFormatException ee)
				{
					JOptionPane.showMessageDialog(null, "Check fields!");
				}
				
			}
			/**
			 * An action, which happens when the "Check In List" button in "Home" tab is pressed.
			 * Prints out all check-ins the today.
			 */
			if(e.getSource()==CheckInListButton)
			{
				try
				{
					String str="";
					for (int i = 0; i < bookAdapter.getAllBookings().getSize(); i++) {
						if(bookAdapter.getAllBookings().getBookingByIndex(i).getCheckIn().equals(new MyDate()))
							str+=bookAdapter.getAllBookings().getBookingByIndex(i);
					}
					homeGuestListArea.setText(str);
				}
				catch(NullPointerException ee)
				{}
			}
			/**
			 * An action, which happens when the "Check Out List" button in "Home" tab is pressed.
			 * Prints out all check-outs the today.
			 */
			if(e.getSource()==CheckOutListButton)
			{
				try{
					String str="";
					for (int i = 0; i < bookAdapter.getAllBookings().getSize(); i++) {
						if(bookAdapter.getAllBookings().getBookingByIndex(i).getCheckOut().equals(new MyDate()))
							str+=bookAdapter.getAllBookings().getBookingByIndex(i);
					}
					homeGuestListArea.setText(str);
				}
				catch(NullPointerException ee)
				{}
			}
			/**
			 * An action, which happens when the "Search" button in "Check In" tab is pressed.
			 * Shows the type and the price of the room with the selected number.
			 */
			if(e.getSource()==roomSearchCheckInButton)
			{
				try
				{
					int number=Integer.parseInt(inputRoomNumberCheckInField.getText());
					inputPriceCheckInField.setText(""+roomAdapter.getRoom(number).getPrice());
					for (int i = 0; i <=5; i++) 
					{
						if(typeCheckInBox.getItemAt(i).toString().equals(roomAdapter.getRoom(number).getType()))
						{
							typeCheckInBox.setSelectedIndex(i);
						}
					}
					
				}
				catch(NumberFormatException ee)
				{
					JOptionPane.showMessageDialog(null, "Check fields!");

				}
				catch(ArrayIndexOutOfBoundsException ee)
				{
					JOptionPane.showMessageDialog(null, "No such room!");
				}
				
			}
		}
		
	}
		
	
	public static void main(String[] args) {
		BookingSystemGUI booking = new BookingSystemGUI();
	}
}