/*
 *  Copyright (c) 2010 Red Hat, Inc.
 *  
 *  This program is licensed to you under Version 3 only of the GNU
 *  General Public License as published by the Free Software 
 *  Foundation. This program is distributed in the hope that it will be 
 *  useful, but WITHOUT ANY WARRANTY; without even the implied 
 *  warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 
 *  PURPOSE.
 *  
 *  See the GNU General Public License Version 3 for more details.
 *  You should have received a copy of the GNU General Public License 
 *  Version 3 along with this program. 
 *  
 *  If not, see http://www.gnu.org/licenses/.
 */

package org.commonjava.rwx.estream;

import org.commonjava.rwx.estream.model.Event;
import org.commonjava.rwx.spi.XmlRpcGenerator;

import java.util.List;

public interface EventStreamGenerator
    extends XmlRpcGenerator
{

    List<Event<?>> getEvents();

    EventStreamGenerator clear();

    EventStreamGenerator add( final Event<?> event );

}
