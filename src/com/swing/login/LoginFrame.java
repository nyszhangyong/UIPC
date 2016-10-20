package com.swing.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.swing.base.BaseInfo;
import com.swing.util.StringUtil;
import com.swing.vo.User;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
    private JTextField userJTextField;
    private JPasswordField passwordJPasswordField;
    private JLabel companyNameJLabel;
    private JLabel userJLabel;
    private JLabel passwordJLabel;
    private JButton loginJButton;
    private JButton logoutJButton;
    private ImageIcon backgroundImageIcon;
    private int backgroundImageWidth;
    private int backgroundImageHeight;
    
    public LoginFrame() {
    	//���ر���ͼƬ    	
    	URL backgroundUrl=LoginFrame.class.getClassLoader().getResource(BaseInfo.imagesPath+"background.gif");
        backgroundImageIcon = new ImageIcon(backgroundUrl);
        //��ȡ����ͼƬ�������
        backgroundImageWidth=backgroundImageIcon.getIconWidth();
        //��ȡ����ͼƬ�߶�����
        backgroundImageHeight=backgroundImageIcon.getIconHeight();
        //���ô��ڱ���
        this.setTitle("ϵͳ��¼");
        //���ô��ڵĿ��ߣ��ֱ���ڱ���ͼƬ�Ŀ��ߣ����ȵ�λ������
        this.setSize(backgroundImageWidth,backgroundImageHeight);       
        //��ʼ�����������
        initComponent();
        //���ô��ڹرհ�ť������ʱִ�еĲ���(�رա����ص�)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //���ô������ݲ��ַ�ʽΪ���Զ�λ���˴���ָ���κβ��ֹ������������Զ�λ��
        this.setLayout(null);
        //���ô�������ڸ���JFrame�����λ�ã�����JFrame��ߡ��ϱߡ��Լ��Ŀ�ߵ�λ�ã�
        this.setBounds(0, 0,backgroundImageWidth,backgroundImageHeight);
        //���ô��ڵı���ͼ��
        URL prodlogoUrl=LoginFrame.class.getClassLoader().getResource(BaseInfo.imagesPath+"prodlogo.gif");
        this.setIconImage(new ImageIcon(prodlogoUrl).getImage());
        //���ô����Ƿ���Ե�����С������Ϊ����ֵ
        this.setResizable(false);
        //���ô�������ڵ�����ʾ����Ļ���Ͻǵ����λ�ã�null����λ����Ļ���룩
        this.setLocationRelativeTo(null);
        //���ô����Ƿ�ɼ������������У����򿴲������棬ʧȥ�˴�����������壩
        this.setVisible(true);
    }
 
    public void initComponent() {
        //����companyNameJLabel�Ŀ��ߡ��Լ������ұ߿�ļ�϶��С
        int companyNameJLabelWidth=260;
        int companyNameJLabelHeight=20;       
        int companyNameJLabelGap=28;
        int companyNameJLabelX=this.getWidth()-companyNameJLabelWidth-companyNameJLabelGap;
        companyNameJLabel = new JLabel();
        companyNameJLabel.setText("����Ӣ�˿Ƽ����޹�˾ ������Ϣϵͳ");
        companyNameJLabel.setBounds(companyNameJLabelX, 26, companyNameJLabelWidth, companyNameJLabelHeight);
 
        //����companyNameJLabel�Ŀ��ߡ��Լ������ұ߿�ļ�϶��С
        int userJLabelWidth=70;
        int userJLabelHeight=20;
        int userJTextFieldWidth=150;
        int userJTextFieldHeight=20;    
        int rightGap=30;
        int userJLlabelX=this.getWidth()-userJLabelWidth-userJTextFieldWidth;
        int userJTextFieldX=this.getWidth()-userJTextFieldWidth-rightGap;
        userJLabel = new JLabel("�û���");
        userJLabel.setBounds(userJLlabelX, 100, userJLabelWidth, userJLabelHeight);        
        userJTextField = new JTextField();
        userJTextField.setText(this.getWidth()+"  "+this.getHeight());
        userJTextField.setBounds(userJTextFieldX, 100, userJTextFieldWidth, userJTextFieldHeight);

        //����companyNameJLabel�Ŀ��ߡ��Լ������ұ߿�ļ�϶��С
        int passwordJLabelWidth=70;
        int passwordJLabelHeight=20;
        int passwordJPasswordFieldWidth=150;
        int passwordJPasswordFieldHeight=20;
        int passwordJLabelX=this.getWidth()-passwordJLabelWidth-passwordJPasswordFieldWidth;
        int passwordJPasswordFieldX=this.getWidth()-passwordJPasswordFieldWidth-rightGap;
        passwordJLabel = new JLabel("���룺");
        passwordJLabel.setBounds(passwordJLabelX, 130, passwordJLabelWidth, passwordJLabelHeight);
        passwordJPasswordField = new JPasswordField();
        passwordJPasswordField.setText("password");
        passwordJPasswordField.setBounds(passwordJPasswordFieldX, 130, passwordJPasswordFieldWidth, passwordJPasswordFieldHeight);
        
        //����loginJButton��logoutJButton�Ŀ��ߡ��Լ�loginJButton�����ұ߿�ļ�϶��С
        int loginJButtonWidth=65;
        int loginJButtonHeight=20;   
        int logoutJButtonWidth=65;
        int logoutJButtonHeight=20;  
        int loginJButtonGap=46;
        int loginJButtonX=this.getWidth()-loginJButtonWidth-logoutJButtonWidth-loginJButtonGap;
        loginJButton = new JButton("��¼");
        loginJButton.setBounds(loginJButtonX, 170, loginJButtonWidth, loginJButtonHeight);
		loginJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				loginJButtonActionPerformed(evt);
			}
		});
		
        //����logoutJButton�����ұ߿�ļ�϶��С
		int logoutJButtonGap=28;
        int logoutJButtonX=this.getWidth()-logoutJButtonWidth-logoutJButtonGap;
        logoutJButton = new JButton("�˳�");
        logoutJButton.setBounds(logoutJButtonX, 170, logoutJButtonWidth, logoutJButtonHeight);
		logoutJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				logoutJButtonActionPerformed(evt);
			}
		});

		//�ѱ���ͼƬ���õ����ڵĵڶ���JlayerPane
		JLabel backgroundJLabel = new JLabel();
        backgroundJLabel.setIcon(backgroundImageIcon);
        backgroundJLabel.setBounds(-2, -2, backgroundImageWidth,backgroundImageHeight);
        getLayeredPane().add(backgroundJLabel,new Integer(Integer.MIN_VALUE)); 
        //JLabel��JButton�����͵���������ص��ڶ���JlayerPane����
        backgroundJLabel.add(companyNameJLabel);
        backgroundJLabel.add(userJLabel);
        backgroundJLabel.add(passwordJLabel);
        backgroundJLabel.add(loginJButton);
        backgroundJLabel.add(logoutJButton);
        
        //��JTextField��JPasswordField���õ����ڵĵ�����ContentPan
    	JPanel  loginFrameContainer = (JPanel) this.getContentPane();
    	//�ѵ���������Ϊ͸���㣬ʹ�ÿ��Կ����ڶ����ϵ���Ϣ
        loginFrameContainer.setOpaque(false);
        
        loginFrameContainer.add(userJTextField);
        loginFrameContainer.add(passwordJPasswordField);
 
    }
 
	private void loginJButtonActionPerformed(ActionEvent evt) {
		String userName = userJTextField.getText();
		String password = new String(passwordJPasswordField.getPassword());
		if (StringUtil.isEmpty(userName)) {
			JOptionPane.showMessageDialog(null, "�û�������д��");
			return;
		}
		if (StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "���������д");
			return;
		}
		User user = new User(userName, password);
		//accessServerByHttpURLConnection(user);

		this.dispose();
		new MainFrame();
	}

	private void accessServerByHttpURLConnection(User user){
		try {
			URL url = new URL("http://127.0.0.1:8080/easerver/myServlet");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			//ʹ��HttpURLConnection���ӽ�������
			httpURLConnection.setDoInput(true);
			//ʹ��HttpURLConnection���ӽ������
			httpURLConnection.setDoOutput(true);
			//����HttpURLConnection�����ӳ�ʱʱ��
			//httpURLConnection.setConnectTimeout(5 * 1000);
			//����HttpURLConnection�Ķ�ȡ��ʱʱ��
			//httpURLConnection.setReadTimeout(10 * 1000);
		    //����HttpURLConnection������ʽΪPOST
			httpURLConnection.setRequestMethod("POST");
			//����HttpURLConnection���ӵĶ��������
			ObjectOutputStream objectOutputStream =new ObjectOutputStream(httpURLConnection.getOutputStream());
			//�����������ʼ��tomcat����˵�servlet����������
			objectOutputStream.writeObject(user);
			//����HttpURLConnection���ӵĶ���������
			ObjectInputStream objectInputStream = new ObjectInputStream(httpURLConnection.getInputStream());
			//������������ʼ��ʼ��ȡ���ص�����
	        User user1 = (User) objectInputStream.readObject();
	        System.out.println("�ͻ��˵õ����������ǣ�" + user1.getUserName());
	        System.out.println("�ͻ��˵õ������û����ǣ� "+ user1.getPassword());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void logoutJButtonActionPerformed(ActionEvent evt) {
		this.dispose();
	}
	
    public static void main(String[] args) {
        new LoginFrame();
    }
 
}