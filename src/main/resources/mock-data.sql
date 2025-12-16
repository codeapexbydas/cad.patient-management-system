-- Clear existing data (optional)
DELETE FROM health_reports;
DELETE FROM patients;
DELETE FROM pms_users;

-- Insert sample patients
INSERT INTO patients (patient_id, name, age, gender, email, phone, address, date_of_birth, emergency_contact, blood_type, created_at, updated_at) VALUES
('P001', 'John Doe', 35, 'Male', 'john.doe@example.com', '123-456-7890', '123 Main St, City', '1989-05-15', 'Jane Doe - 987-654-3210', 'O+', '2024-01-01 10:00:00', '2024-01-01 10:00:00'),
('P002', 'Jane Smith', 28, 'Female', 'jane.smith@example.com', '987-654-3210', '456 Oak Ave, Town', '1996-08-22', 'John Smith - 123-456-7890', 'A-', '2024-01-01 10:00:00', '2024-01-01 10:00:00'),
('P003', 'Robert Johnson', 45, 'Male', 'robert.j@example.com', '555-123-4567', '789 Pine Rd, Village', '1979-03-10', 'Mary Johnson - 555-987-6543', 'B+', '2024-01-01 10:00:00', '2024-01-01 10:00:00'),
('P004', 'Emily Davis', 32, 'Female', 'emily.davis@example.com', '444-555-6666', '321 Elm St, County', '1992-11-30', 'Michael Davis - 444-666-7777', 'AB+', '2024-01-01 10:00:00', '2024-01-01 10:00:00');

-- Insert sample health reports
INSERT INTO health_reports (report_id, patient_id, report_date, report_type, issued_at) VALUES
('R001', 'P001', '2024-01-15', 'General Checkup', '2024-01-15'),
('R002', 'P001', '2024-02-20', 'Blood Test', '2024-02-20'),
('R003', 'P001', '2024-03-10', 'X-Ray', '2024-03-10'),
('R004', 'P002', '2024-01-20', 'Annual Physical', '2024-01-20'),
('R005', 'P002', '2024-02-25', 'MRI Scan', '2024-02-25'),
('R006', 'P003', '2024-01-25', 'Cardiology Checkup', '2024-01-25'),
('R007', 'P003', '2024-03-05', 'Blood Work', '2024-03-05'),
('R008', 'P004', '2024-02-10', 'Dermatology Consultation', '2024-02-10');

-- Insert sample users (passwords are 'password123' encoded)
INSERT INTO pms_users (id, username, password, role) VALUES
('u1', 'admin', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBo5f5gL2k7FqK', 'ROLE_ADMIN'),
('u2', 'doctor', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBo5f5gL2k7FqK', 'ROLE_DOCTOR'),
('u3', 'patient', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBo5f5gL2k7FqK', 'ROLE_PATIENT'),
('u4', 'reception', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBo5f5gL2k7FqK', 'ROLE_RECEPTIONIST');